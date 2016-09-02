package be.jeroendruwe.authserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

/**
 * Created by jdruwe on 15/06/16.
 */

@Configuration
@EnableAuthorizationServer
public class OAuth2Configuration extends AuthorizationServerConfigurerAdapter {

    private static final int ONE_DAY = 60 * 60 * 24;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(new ClassPathResource("jwt.jks"), "jwtSecretKey".toCharArray());
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setKeyPair(keyStoreKeyFactory.getKeyPair("jwt"));
        return converter;
    }

    //TODO: secret and token validity seconds must be configurable
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("travel-client")
                .secret("travel-secret")
                .authorities(OAuth2Authority.ROLE_ADMIN.name(), OAuth2Authority.ROLE_USER.name())
                .authorizedGrantTypes("implicit", "authorization_code", "refresh_token", "password")
                .accessTokenValiditySeconds(ONE_DAY)
                .scopes(OAuth2Scope.COUNTRY_READ.name(), OAuth2Scope.ATTRACTION_READ.name(), OAuth2Scope.FAVORITE_READ.name())
                .autoApprove(true);
    }


    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .authenticationManager(authenticationManager)
                .accessTokenConverter(jwtAccessTokenConverter());
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {

        //http://localhost:8080/oauth/check_token -> used by Resource Servers to decode access tokens
        //http://localhost:8080/oauth/token_key -> exposes public key for token verification if using JWT tokens

        oauthServer
                .tokenKeyAccess("isAnonymous() || hasAuthority('" + OAuth2Authority.ROLE_ADMIN + "," + OAuth2Authority.ROLE_USER + "')")
                .checkTokenAccess("isAuthenticated()");
    }
}

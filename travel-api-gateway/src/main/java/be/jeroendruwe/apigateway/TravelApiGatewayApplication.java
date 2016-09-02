package be.jeroendruwe.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by jdruwe on 09/07/16.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class TravelApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelApiGatewayApplication.class, args);
    }
}

package be.jeroendruwe.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by jdruwe on 09/07/16.
 */

@SpringBootApplication
@EnableConfigServer
public class TravelConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelConfigServerApplication.class, args);
    }

}

package be.jeroendruwe.serviceregistry;

/**
 * Created by jdruwe on 09/07/16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TravelServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelServiceRegistryApplication.class, args);
    }

}

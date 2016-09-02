package be.jeroendruwe.countryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TravelCountryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TravelCountryServiceApplication.class, args);
    }
}

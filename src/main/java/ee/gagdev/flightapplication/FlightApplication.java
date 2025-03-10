package ee.gagdev.flightapplication;

import ee.gagdev.flightapplication.Api.FlightApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static ee.gagdev.flightapplication.Api.FlightGenerator.generateNewFlights;


@SpringBootApplication
public class FlightApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlightApplication.class, args);
    }

    // This ↓↓ code was got from Stackoverflow, i didn't find a way myself to get the API data on script startup
    @Bean
    CommandLineRunner run(ApplicationContext ctx) {
       return args -> {
            FlightApi flightApi = ctx.getBean(FlightApi.class);
            flightApi.isFlightsDataLoaded();
        };
    }
}

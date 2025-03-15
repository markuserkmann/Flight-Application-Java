package ee.gagdev.flightapplication.Api;

import ee.gagdev.flightapplication.FlightData.FlightData;
import ee.gagdev.flightapplication.FlightData.FlightResponse;
import ee.gagdev.flightapplication.FlightData.Seats;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class FlightApi {
    private boolean apiLoaded = false;
    private final FlightApiService flightApiService;
    private static final String File_Path = "flights.json";

    @Autowired
    public FlightApi(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    // Loads the flightdata from a API or file on program startup to avoid unnecessary requests to the API
    public void isFlightsDataLoaded() {
        if (!apiLoaded) {
            try {
                String apiData = flightApiService.getApiResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                FlightResponse response = objectMapper.readValue(apiData, FlightResponse.class);
                Random random = new Random();

                // Sets the price between 350-580 for each flight. Adds 150 to economy plus and 300 to business on the client side.
                for (FlightData flight : response.getData()) {
                    int flightPrice = random.nextInt(231) + 350;
                    flight.setFlightPrice(flightPrice);
                    flight.setSeats(new Seats());
                }

                List<FlightData> generatedFlights = FlightGenerator.generateNewFlights();
                for (FlightData flight : generatedFlights) {
                    flight.setSeats(new Seats());
                }

                response.getData().addAll(generatedFlights);

                String updatedApiData = objectMapper.writeValueAsString(response);
                Files.write(Paths.get(File_Path), updatedApiData.getBytes(StandardCharsets.UTF_8));

                apiLoaded = true;
            } catch (IOException e) {
                System.out.println("Error in getting API response or reading file: " + e.getMessage());
            }
        }
    }

    public List<FlightData> fetchFlightsInfoFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource(File_Path).getInputStream();
        FlightResponse response = objectMapper.readValue(inputStream, FlightResponse.class);
        return response.getData();
    }
}

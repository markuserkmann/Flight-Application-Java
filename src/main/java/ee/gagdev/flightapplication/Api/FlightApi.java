package ee.gagdev.flightapplication.Api;

import ee.gagdev.flightapplication.FlightData.FlightData;
import ee.gagdev.flightapplication.FlightData.FlightResponse;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
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
    private static final String File_Path = "src/main/resources/flights.json";

    @Autowired
    public FlightApi(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    // Loads the flightdata from a api on the program startup to avoid not needed requests to the API
    public void isFlightsDataLoaded() {
        if (!apiLoaded) {
            try {
                String apiData = flightApiService.getApiResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                FlightResponse response = objectMapper.readValue(apiData, FlightResponse.class);
                Random random = new Random();

                // Sets the price betweeen 350-580 for each flight. Will be modified later to adapt different seating options (first class, business etc)
                for (FlightData flight : response.getData()) {
                    int FlightPrice = random.nextInt(231) + 350;
                    flight.setFlightPrice(FlightPrice);
                }
                List<FlightData> generatedFlights = FlightGenerator.generateNewFlights();

                response.getData().addAll(generatedFlights);

                String updatedApiData = objectMapper.writeValueAsString(response);

                Files.write(Paths.get(File_Path), updatedApiData.getBytes(StandardCharsets.UTF_8));

                apiLoaded = true;
            } catch (IOException e) {
                System.out.println("Error in getting API response: " + e.getMessage());
            }
        }
    }
}

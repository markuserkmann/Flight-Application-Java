package ee.gagdev.flightapplication.Api;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class FlightApi {
    private boolean apiLoaded = false;
    private final FlightApiService flightApiService;

    @Autowired
    public FlightApi(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    public void isFlightsDataLoaded() {
        if (!apiLoaded) {
            try {
                String apiData = flightApiService.getApiResponse();
                String jsonFilePath = "src/main/resources/flights.json";
                Files.write(Paths.get(jsonFilePath), apiData.getBytes(StandardCharsets.UTF_8));

                apiLoaded = true;
            } catch (IOException e) {
                System.out.println("Error in getting API response: " + e.getMessage());
            }
        }
    }
}

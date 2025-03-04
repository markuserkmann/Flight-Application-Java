package ee.gagdev.flightapplication.Api;

import org.springframework.stereotype.Component;

@Component
public class FlightApi {
    private boolean ApiLoaded = false;
    private final FlightApiService flightapiService;

    public FlightApi(FlightApiService flightapiService) {
        this.flightapiService = flightapiService;
    }

    public void FetchFlightsInfo() {
        System.out.println(flightapiService.getApiResponse());
    }
}

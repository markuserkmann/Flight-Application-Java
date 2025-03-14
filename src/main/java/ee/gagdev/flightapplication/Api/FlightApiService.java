package ee.gagdev.flightapplication.Api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightApiService {
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String ApiKey = "";

    public static String getApiResponse() {
        String url = String.format("https://api.aviationstack.com/v1/flights?access_key=%s&flight_status=scheduled", ApiKey);
        return restTemplate.getForObject(url, String.class);
    }
}
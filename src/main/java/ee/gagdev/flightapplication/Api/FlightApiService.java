package ee.gagdev.flightapplication.Api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightApiService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String ApiKey = "";

    public String getApiResponse() {
        String url = String.format("https://api.aviationstack.com/v1/flights?access_key=%s", ApiKey);
        return restTemplate.getForObject(url, String.class);
    }
}

package ee.gagdev.flightapplication.Api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightApiService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String ApiKey = "8d1d4c08da125b59e3a1b3f79d7e865f";

    public String getApiResponse() {
        String url = String.format("https://api.aviationstack.com/v1/flights?access_key=%s", ApiKey);
        return restTemplate.getForObject(url, String.class);
    }
}

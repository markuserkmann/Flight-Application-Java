package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResponse {
    private List<FlightData> data;

    public List<FlightData> getData() {
        return data;
    }
}

// These classes were generated using AI to speed up development.
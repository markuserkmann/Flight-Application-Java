package ee.gagdev.flightapplication.Api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // This ignores the "pagination" field and any others you don't map.
public class FlightResponse {
    private List<FlightData> data;

    public List<FlightData> getData() {
        return data;
    }

    public void setData(List<FlightData> data) {
        this.data = data;
    }
}

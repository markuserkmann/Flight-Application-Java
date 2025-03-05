package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airline {
    private String name;
    private String iata;
    private String icao;

    public String getName() {
        return name;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }
}

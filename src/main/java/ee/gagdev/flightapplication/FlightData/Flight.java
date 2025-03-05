package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    private String number;
    private String iata;
    private String icao;

    public String getNumber() {
        return number;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }
}

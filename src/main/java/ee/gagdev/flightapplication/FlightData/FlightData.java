package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightData {
    private String flight_date;
    private String flight_status;
    private Departure departure;
    private Arrival arrival;
    private Airline airline;
    private Flight flight;
    private Object aircraft;
    private Object live;

    public String getFlight_date() {
        return flight_date;
    }

    public String getFlight_status() {
        return flight_status;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public Airline getAirline() {
        return airline;
    }

    public Flight getFlight() {
        return flight;
    }

    public Object getAircraft() {
        return aircraft;
    }

    public Object getLive() {
        return live;
    }
}

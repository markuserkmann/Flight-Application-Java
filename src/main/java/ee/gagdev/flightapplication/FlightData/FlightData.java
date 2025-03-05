package ee.gagdev.flightapplication.Api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightData {
    private String flight_date;
    private String flight_status;
    private Departure departure;
    private Arrival arrival;
    private Airline airline;
    private Flight flight;
    private Object aircraft; // Use a proper type if available.
    private Object live;     // Use a proper type if available.

    // Getters and Setters
    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public String getFlight_status() {
        return flight_status;
    }

    public void setFlight_status(String flight_status) {
        this.flight_status = flight_status;
    }

    public Departure getDeparture() {
        return departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Object getAircraft() {
        return aircraft;
    }

    public void setAircraft(Object aircraft) {
        this.aircraft = aircraft;
    }

    public Object getLive() {
        return live;
    }

    public void setLive(Object live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "flight_date='" + flight_date + '\'' +
                ", flight_status='" + flight_status + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", airline=" + airline +
                ", flight=" + flight +
                ", aircraft=" + aircraft +
                ", live=" + live +
                '}';
    }
}

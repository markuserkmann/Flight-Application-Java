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
    private int flight_price;
    private Seats seats;

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

    public int getFlightPrice() {
        return flight_price;
    }

    public void setFlightPrice(int flight_price) {
        this.flight_price = flight_price;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }
}

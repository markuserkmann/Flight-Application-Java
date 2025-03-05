package ee.gagdev.flightapplication.Api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Departure {
    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private Integer delay;
    private String scheduled;
    private String estimated;
    private String actual;
    private String estimated_runway;
    private String actual_runway;

    public String getAirport() {
        return airport;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getGate() {
        return gate;
    }

    public Integer getDelay() {
        return delay;
    }

    public String getScheduled() {
        return scheduled;
    }

    public String getEstimated() {
        return estimated;
    }

    public String getActual() {
        return actual;
    }

    public String getEstimated_runway() {
        return estimated_runway;
    }

    public String getActual_runway() {
        return actual_runway;
    }

}

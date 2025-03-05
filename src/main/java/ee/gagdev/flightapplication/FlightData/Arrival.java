package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arrival {
    private String airport;
    private String timezone;
    private String iata;
    private String icao;
    private String terminal;
    private String gate;
    private String baggage;
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


    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getEstimated() {
        return estimated;
    }

    public void setEstimated(String estimated) {
        this.estimated = estimated;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getEstimated_runway() {
        return estimated_runway;
    }

    public void setEstimated_runway(String estimated_runway) {
        this.estimated_runway = estimated_runway;
    }

    public String getActual_runway() {
        return actual_runway;
    }

    public void setActual_runway(String actual_runway) {
        this.actual_runway = actual_runway;
    }
}

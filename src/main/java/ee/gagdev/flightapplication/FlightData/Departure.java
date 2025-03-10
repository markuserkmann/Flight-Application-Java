package ee.gagdev.flightapplication.FlightData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Departure {
    private String airport;
    private String timezone;
    private String terminal;
    private String gate;
    private Integer delay;
    private String scheduled;
    private String estimated;
    private String actual;

    public String getAirport() {
        return airport;
    }

    public String getTimezone() {
        return timezone;
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
}

package ee.gagdev.flightapplication.Api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    private String number;
    private String iata;
    private String icao;
    private Codeshared codeshared;

    // Getters and Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public Codeshared getCodeshared() {
        return codeshared;
    }

    public void setCodeshared(Codeshared codeshared) {
        this.codeshared = codeshared;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", iata='" + iata + '\'' +
                ", icao='" + icao + '\'' +
                ", codeshared=" + codeshared +
                '}';
    }
}

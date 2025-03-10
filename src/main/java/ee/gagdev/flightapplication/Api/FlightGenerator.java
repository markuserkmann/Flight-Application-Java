package ee.gagdev.flightapplication.Api;

import ee.gagdev.flightapplication.FlightData.Arrival;
import ee.gagdev.flightapplication.FlightData.Departure;
import ee.gagdev.flightapplication.FlightData.FlightData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FlightGenerator {
    private static final List<String> europeanCountries = Arrays.asList(
            "Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia and Herzegovina",
            "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia",
            "Finland", "France", "Germany", "Greece", "Hungary", "Iceland", "Ireland",
            "Italy", "Latvia", "Liechtenstein", "Lithuania", "Luxembourg", "Malta",
            "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia",
            "Norway", "Poland", "Portugal", "Romania", "San Marino", "Serbia",
            "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Ukraine",
            "United Kingdom"
    );

    private static final Random random = new Random();

    public static List<FlightData> generateNewFlights() {
        List<FlightData> flights = new ArrayList<>();
        for (String country : europeanCountries) {
            FlightData flight = new FlightData();

            String DepartureCountry = country + " International";
            String RandomArrivalCountry = europeanCountries.get(random.nextInt(europeanCountries.size())) + " International";

            flight.setFlight_date("2025-" + String.format("%02d", random.nextInt(12) + 5) + "-" + String.format("%02d", random.nextInt(28) + 1));
            flight.setFlight_status("scheduled");
            int FlightPrice = random.nextInt(231) + 350;
            flight.setFlightPrice(FlightPrice);

            Departure departure = new Departure();
            departure.setAirport(DepartureCountry);

            Arrival arrival = new Arrival();
            arrival.setAirport(RandomArrivalCountry);

            flight.setDeparture(departure);
            flight.setArrival(arrival);
            flights.add(flight);
        }
        return flights;
    }
}
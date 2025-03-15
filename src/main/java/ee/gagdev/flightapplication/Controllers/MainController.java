package ee.gagdev.flightapplication.Controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import ee.gagdev.flightapplication.FlightData.FlightData;
import ee.gagdev.flightapplication.FlightData.FlightResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String showFlights(Model model) throws IOException {
        List<FlightData> flightData = fetchFlightsInfo();
        model.addAttribute("flights", flightData);
        return "flights";
    }

    public static List<FlightData> fetchFlightsInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource("flights.json").getInputStream();
        FlightResponse response = objectMapper.readValue(inputStream, FlightResponse.class);
        return response.getData();
    }

}
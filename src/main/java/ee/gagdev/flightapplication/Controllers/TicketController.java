package ee.gagdev.flightapplication.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.gagdev.flightapplication.FlightData.FlightData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/piletid")
public class TicketController {

    @GetMapping("/{id}")
    public String getFlightDataForId(@PathVariable int id, Model model) throws IOException {
            List<FlightData> flights = MainController.fetchFlightsInfo();
            Map<Integer, FlightData> flightMap = flights.stream()
                    .collect(Collectors.toMap(flights::indexOf, flight -> flight));

            if (flightMap.containsKey(id)) {
                FlightData flightData = flightMap.get(id);
                model.addAttribute("flight", flightData);

                ObjectMapper objectMapper = new ObjectMapper();
                String jsonAsString = objectMapper.writeValueAsString(flightData);

                model.addAttribute("flightJson", jsonAsString);

            } else {
                return "error";
            }

        return "ticketbooking";
    }
}
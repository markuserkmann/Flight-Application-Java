package ee.gagdev.flightapplication.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/piletid")
public class TicketController {

    @GetMapping("/{id}")
    public String getFlightDataForId(@PathVariable Long id) {
        return "TicketBooking";
    }

}

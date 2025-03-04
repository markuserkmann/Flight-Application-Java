package ee.gagdev.flightapplication.Controllers;

import ee.gagdev.flightapplication.Api.FlightApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private final FlightApi flightApi;

    public MainController(FlightApi flightApi) {
        this.flightApi = flightApi;
    }

    @RequestMapping("/")
    public String index() {
        flightApi.FetchFlightsInfo();
        return "index";
    }
}
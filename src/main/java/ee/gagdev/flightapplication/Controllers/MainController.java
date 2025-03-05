package ee.gagdev.flightapplication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() throws IOException {
        return "index";
    }
}
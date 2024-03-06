package app.error.customerror.Api;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

/**
 * @author MJ Makki
 * @version 1.0
 * @license SkyLimits, LLC (<a href="https://www.skylimits.tech">SkyLimits, LLC</a>)
 * @email m.makki@skylimits.tech
 * @since long time ago
 */
@RestController
@RequestMapping("/forbidden")
public class CustomErrorApi implements ErrorController {
    @GetMapping("/error")
    public String handleError(){
        return "Oops, can't move forward you don't have access or authorization";
    }
}

package orz.nurseroastering.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/")
    public String index() {
        return "API worked!";
    }

}

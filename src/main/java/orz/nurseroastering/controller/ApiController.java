package orz.nurseroastering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import orz.nurseroastering.domain.ShiftAssignment;
import orz.nurseroastering.service.ShiftService;

import java.util.Collections;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ShiftService shiftService;

    @RequestMapping("/hello")
    public String index() {
        return "API worked!";
    }

    @RequestMapping("/start")
    public List<ShiftAssignment> startPlan() {
        List<ShiftAssignment> plan;
        try {
            plan = shiftService.plan();
        } catch (Exception e) {
            return Collections.emptyList();
        }
        return plan;
    }

}

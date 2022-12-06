package fhtw.LengthCalc.controller;

import fhtw.LengthCalc.service.LengthCalcService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthCalcController {
    private final LengthCalcService service;

    public LengthCalcController(LengthCalcService service) {
        this.service = service;
    }

    @PostMapping("/api/inch/{inch}")
    Float getCentimeter(@PathVariable Float inch){
        return service.getCentimeter(inch);
    }

    @PostMapping("/api/yard/{yard}")
    Float calcMeter(@PathVariable Float yard){
        return service.getMeter(yard);
    }
}

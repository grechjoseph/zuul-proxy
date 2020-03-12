package com.jg.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {

    @GetMapping("/test")
    public String getString() {
        return "World!";
    }

}

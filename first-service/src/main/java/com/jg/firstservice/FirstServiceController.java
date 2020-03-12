package com.jg.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstServiceController {

    @GetMapping("/test")
    public String getString() {
        return "Hello";
    }

}

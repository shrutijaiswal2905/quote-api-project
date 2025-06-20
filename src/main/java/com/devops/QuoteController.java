package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public String getQuote() {
        return "Stay hungry, stay foolish.";
    }
}

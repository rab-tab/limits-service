package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimits()
    {
       // return new Limits(1,1000);
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}

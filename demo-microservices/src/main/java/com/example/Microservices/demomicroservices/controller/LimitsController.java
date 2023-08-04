package com.example.Microservices.demomicroservices.controller;

import com.example.Microservices.demomicroservices.beans.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(1,23);
    }
}

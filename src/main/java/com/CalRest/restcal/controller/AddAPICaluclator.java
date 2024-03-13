package com.CalRest.restcal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/add")
public class AddAPICaluclator {

    @GetMapping
    public int caluclate(@RequestParam String x, @RequestParam String y) {
        int xValue = Integer.parseInt(x);
        int yValue = Integer.parseInt(y);
        int sum = xValue + yValue;
        return sum;
    }    
}

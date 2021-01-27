package com.company.controllers.enumparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class FruitController {

    public enum Fruit {
        Apple,
        Banana,
        Orange
    }

    @RequestMapping("/fruit")
    public String handleRequest(@RequestParam("name") Fruit fruit) {
        return "response for " + fruit;
    }

    @RequestMapping("/fruits")
    public String handleRequest2(@RequestParam("name") Fruit[] fruits) {
        return "response for " + Arrays.toString(fruits);
    }
}

package com.company.controllers.multiparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @RequestMapping("/items")
    public String handleRequest(@RequestParam("id") String[] itemIds) {
        StringBuilder response = new StringBuilder();

        for (String id : itemIds) {
            response.append("item with string id ").append(id).append("<br>");
        }

        return response.toString();
    }

    @RequestMapping("/items2")
    public String handleRequest2(@RequestParam("id") int[] itemsIds) {
        StringBuilder response = new StringBuilder();

        for (int id : itemsIds) {
            response.append("item with int id ").append(id).append("<br>");
        }

        return response.toString();
    }
}

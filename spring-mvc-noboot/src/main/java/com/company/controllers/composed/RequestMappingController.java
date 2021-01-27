package com.company.controllers.composed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class RequestMappingController {

    @GetMapping("test")
    public String handleGetRequest() {
        return "GetMapping-view";
    }

    @PostMapping("test")
    public String handlePostRequest() {
        return "PostMapping-view";
    }

    @PutMapping("test")
    public String handlePutRequest() {
        return "PutMapping-view";
    }

    @DeleteMapping("test")
    public String handleDeleteRequest() {
        return "DeleteMapping-view";
    }
}

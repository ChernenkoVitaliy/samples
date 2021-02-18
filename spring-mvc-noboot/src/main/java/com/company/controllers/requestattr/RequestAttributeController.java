package com.company.controllers.requestattr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/attribute")
public class RequestAttributeController {

    @ResponseBody
    @RequestMapping
    public String handle(@RequestAttribute("visitorCounter") Integer counter) {
        return String.format("Visitor number: %d", counter);
    }
}

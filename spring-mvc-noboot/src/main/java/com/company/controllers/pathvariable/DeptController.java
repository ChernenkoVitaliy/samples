package com.company.controllers.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @RequestMapping(value = "{id:[0-9]+}")
    public String handleRequest(@PathVariable("id") String userId, Model model) {
        model.addAttribute("msg", "profile id: " + userId);
        return "my-page";
    }

    @RequestMapping(value = "{name:[a-zA-Z]+}")
    public String handleRequest2(@PathVariable("name") String deptName, Model model) {
        model.addAttribute("msg", "dept name: " + deptName);
        return "my-page";
    }
}

package com.company.controllers.reqmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reqmapping/users")
public class UserControllerRegex {

    @RequestMapping("{id:[0-9]+}")
    public String handleAllUsersRequest(Model model, @PathVariable("id") String id) {
        System.out.println("User id digits " + id);
        model.addAttribute("userId", id);
        return "all-users";
    }

    @RequestMapping("{id:[a-z]+}")
    public String handleAllUsersRequest2(Model model, @PathVariable("id") String id) {
        System.out.println("user id alphas " + id);
        model.addAttribute("userId", id);
        return "all-users";
    }
}

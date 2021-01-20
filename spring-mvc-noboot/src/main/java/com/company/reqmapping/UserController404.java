package com.company.reqmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/not/found/users")
public class UserController404 {

    @RequestMapping
    public String handleAllUsers() {
        return "all-users";
    }
}

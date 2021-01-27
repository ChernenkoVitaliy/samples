package com.company.controllers.reqmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/all/**/users")
public class UserControllerPath {

    @RequestMapping()
    public String handleAllUsersRequest(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "";
    }
}

package com.company.controllers.reqmapping;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/empty/consumes/users")
public class UserControllerConsume {

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String handleJSON(@RequestBody String s) {
        System.out.println("json body: " + s);
        return "";
    }

    @RequestMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String handleXML(@RequestBody String s) {
        System.out.println("XML body: " + s);
        return "";
    }
}

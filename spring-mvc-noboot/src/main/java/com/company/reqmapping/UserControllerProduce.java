package com.company.reqmapping;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/consumes/users")
public class UserControllerProduce {

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String handleJson() {
        System.out.println("Got JSON request");
        return "{ \"userName\" : \"Joe\" }";
    }

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String handleXML() {
        System.out.println("Got XML request");
        return "<userName>Joe</userName>";
    }
}

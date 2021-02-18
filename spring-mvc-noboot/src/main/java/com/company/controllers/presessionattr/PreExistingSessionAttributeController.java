package com.company.controllers.presessionattr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.time.Duration;
import java.time.LocalDateTime;

@Controller
@RequestMapping("presessionattr")
public class PreExistingSessionAttributeController {

    @RequestMapping("/")
    @ResponseBody
    public String handle(@SessionAttribute(name = "sessionStartTime") LocalDateTime starDateTime) {
        Duration d = Duration.between(starDateTime, LocalDateTime.now());
        return String.format("First visit time: %s <br /> Visiting site for: " +
                " %s seconds", starDateTime, d.getSeconds());
    }
}

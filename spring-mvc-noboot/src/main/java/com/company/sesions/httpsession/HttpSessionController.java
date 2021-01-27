package com.company.sesions.httpsession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@ResponseBody
@RequestMapping("httpsession")
public class HttpSessionController {

    @RequestMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String handleRequest(HttpSession httpSession) {
        String sessionKey = "firstAccessTime";
        Object time = httpSession.getAttribute(sessionKey);
        if (time == null) {
            time = LocalDateTime.now();
            httpSession.setAttribute(sessionKey, time);
        }

        return "first access time: " + time + "\nsession id: " + httpSession.getId();
    }
}

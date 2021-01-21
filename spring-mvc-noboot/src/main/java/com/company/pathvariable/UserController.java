package com.company.pathvariable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "{id}")
    public String handleRequest(@PathVariable("id") String userId, Model model) {
        model.addAttribute("msg", "User id: " + userId);
        return "my-page";
    }

    @RequestMapping(value = "profiles/{userName}")
    public String handleRequest2(@PathVariable("userName") String userName, Model model) {
        model.addAttribute("msg", "user profile name: " + userName);
        return "my-page";
    }

    @RequestMapping("{id}/posts/{postId}")
    public String handleRequest3(@PathVariable("id") String userId,
                                 @PathVariable("postId") String postId,
                                 Model model) {
        model.addAttribute("msg", "user id: " + userId + ", post id: " + postId);
        return "my-page";
    }

    @RequestMapping("{id}/messages/{msgId}")
    public String handleRequest4(@PathVariable Map<String, String> varsMap, Model model) {
        model.addAttribute("msg", varsMap.toString());
        return "my-page";
    }
}

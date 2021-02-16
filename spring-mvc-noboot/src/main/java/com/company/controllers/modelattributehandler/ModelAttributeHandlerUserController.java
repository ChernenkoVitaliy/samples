package com.company.controllers.modelattributehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("model/attr/handler/users")
public class ModelAttributeHandlerUserController {

    @Autowired
    private ModelAttributeUserService userService;

    @RequestMapping("{userId}")
    public String HandelRequestById(@ModelAttribute("user") ModelAttributeUser user, Model model) {
        model.addAttribute("msg", "user: " + user);
        return user!= null && "admin".equals(user.getRole()) ? "admin-page" : "user-page";
    }

    @ModelAttribute("user")
    public ModelAttributeUser getUser(@PathVariable("userId") long userId) {
        return userService.getUserById(userId);
    }
}

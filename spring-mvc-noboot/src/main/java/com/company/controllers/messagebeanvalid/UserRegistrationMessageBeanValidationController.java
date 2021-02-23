package com.company.controllers.messagebeanvalid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/messagebeanvalid")
public class UserRegistrationMessageBeanValidationController {

    @Autowired
    private UserServiceMessageBeanValidation userService;


    @GetMapping
    public String handleGetRequest(Model model) {
        model.addAttribute("user", new UserMessageBeanValidation());
        return "user-registration-message";
    }

    @PostMapping
    public String handlePostRequest(@Valid @ModelAttribute("user") UserMessageBeanValidation user,
                                    BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "user-registration-message";
        }

        userService.saveUser(user);
        return "registration-done-message";
    }
}

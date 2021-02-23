package com.company.controllers.validform;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping("/valid/register")
public class UserValidRegistrationController {

    @Autowired
    private ValidUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String handleGetRequest() {
        return "user-registration-valid";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePostRequest(@Valid UserDto userDto, BindingResult bindingResult,
                                    Model model) {

        if (bindingResult.hasErrors()) {
            populateError("name", model, bindingResult);
            populateError("emailAddress", model, bindingResult);
            populateError("password", model, bindingResult);

            return "user-registration-valid";
        }

        userService.saveUser(userDto);
        model.addAttribute("user", userDto);
        return "registration-done";
    }

    private void populateError(String field, Model model, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors(field)) {
            model.addAttribute(field + "Error", bindingResult.getFieldError(field)
                    .getDefaultMessage());
        }
    }
}

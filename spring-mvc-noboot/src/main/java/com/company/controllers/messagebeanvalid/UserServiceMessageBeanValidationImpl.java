package com.company.controllers.messagebeanvalid;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserServiceMessageBeanValidationImpl implements UserServiceMessageBeanValidation {
    private Map<Long, UserMessageBeanValidation> userMap = new HashMap<>();

    @Override
    public void saveUser(UserMessageBeanValidation user) {
        if (user.getId() == null) {
            user.setId((long) (userMap.size() + 1));
        }

        userMap.put(user.getId(), user);
    }
}

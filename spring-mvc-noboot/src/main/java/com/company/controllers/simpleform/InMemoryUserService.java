package com.company.controllers.simpleform;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryUserService implements UserService{
    private Map<Long, User> userMap = new HashMap<>();


    @Override
    public void userSave(User user) {
        if (user.getId() == null) {
            user.setId((long) (userMap.size() + 1));
        }

        userMap.put(user.getId(), user);
    }
}

package com.company.controllers.modelattributehandler;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class ModelAttributeUserServiceImpl implements ModelAttributeUserService{

    private Map<Long, ModelAttributeUser> userMap = new HashMap<>();

    @PostConstruct
    private void postConstruct() {
        Random random = new Random();
        List<String> roles = Arrays.asList("admin", "real-only", "guest");
        for (int i = 0; i < 10; i++) {
            ModelAttributeUser user = new ModelAttributeUser();
            user.setId(i);
            user.setName(UUID.randomUUID().toString() + " Name");
            user.setRole(roles.get(random.nextInt(3)));
            userMap.put((long) i, user);
        }
    }

    @Override
    public ModelAttributeUser getUserById(long id) {
        return userMap.get(id);
    }
}

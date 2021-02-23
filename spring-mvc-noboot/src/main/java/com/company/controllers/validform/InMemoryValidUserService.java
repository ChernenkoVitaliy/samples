package com.company.controllers.validform;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryValidUserService implements ValidUserService {
    private Map<Long, UserEntity> userMap = new HashMap<>();

    @Override
    public void saveUser(UserDto userDto) {
        if (userMap.get(userDto.getId()) != null) {
            UserEntity entity = userMap.get(userDto.getId());
            entity.setName(userDto.getName());
            entity.setEmailAddress(userDto.getEmailAddress());
            entity.setId(userDto.getId());
            entity.setPassword(userDto.getPassword());
        } else {
            UserEntity entity = new UserEntity();
            entity.setName(userDto.getName());
            entity.setEmailAddress(userDto.getEmailAddress());
            entity.setId(userDto.getId());
            entity.setPassword(userDto.getPassword());
            long id = (userMap.size() + 1);
            entity.setId(id);
            userDto.setId(id);
            userMap.put(entity.getId(), entity);
        }
    }
}

package com.example.studyclouduserservice.service;

import com.example.studyclouduserservice.dto.UserDto;
import com.example.studyclouduserservice.entity.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}

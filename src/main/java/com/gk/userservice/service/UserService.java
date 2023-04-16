package com.gk.userservice.service;

import com.gk.userservice.model.User;

public interface UserService {
     public User save(User user);
     public User findByUserId(long userId);
}

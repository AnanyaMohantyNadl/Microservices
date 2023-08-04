package com.example.Microservices.userms.service;

import com.example.Microservices.userms.model.User;
import com.example.Microservices.userms.repository.UserRepository;

public interface UserService {
    public User getUser(Long id);
    User createUser(User user);
}

package com.example.Microservices.userms.serviceImpl;

import com.example.Microservices.userms.model.User;
import com.example.Microservices.userms.repository.UserRepository;
import com.example.Microservices.userms.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }
}

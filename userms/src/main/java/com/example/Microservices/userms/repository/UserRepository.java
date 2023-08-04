package com.example.Microservices.userms.repository;

import com.example.Microservices.userms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

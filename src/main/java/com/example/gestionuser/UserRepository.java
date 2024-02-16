package com.example.gestionuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<user, Long> {
    Optional<user> findByEmail(String email);
}

// Controller for handling user registration

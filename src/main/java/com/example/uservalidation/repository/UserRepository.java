package com.example.uservalidation.repository;

import com.example.uservalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

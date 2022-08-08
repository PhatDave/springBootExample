package com.example.benjaminspringexample.repository;

import com.example.benjaminspringexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

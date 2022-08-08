package com.example.benjaminspringexample.service;

import com.example.benjaminspringexample.entity.User;

import java.util.List;

public interface UserService {
	List<User> getAll();
	User addUser(User user);
}

package com.example.benjaminspringexample.service;

import com.example.benjaminspringexample.entity.User;
import com.example.benjaminspringexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Override
	public User getById(Long id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}
}

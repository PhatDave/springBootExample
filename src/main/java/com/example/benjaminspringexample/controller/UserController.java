package com.example.benjaminspringexample.controller;

import com.example.benjaminspringexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
}

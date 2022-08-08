package com.example.benjaminspringexample.controller;

import com.example.benjaminspringexample.entity.User;
import com.example.benjaminspringexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;

	@GetMapping
	public String index(Model model) {
		model.addAttribute("users", userService.getAll());
		List<User> users = userService.getAll();
		return "index";
	}

	@GetMapping("/add")
	public String getRegisterForm(Model model) {
		model.addAttribute("user", new User());
		return "user-add";
	}

	@PostMapping("/add")
	public String addUser(@ModelAttribute User user) {
		userService.addUser(user);
		return "redirect:/user/";
	}
}

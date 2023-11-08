package com.excellence.springboot_dto_tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.springboot_dto_tutorial.dto.UserLocationDTO;
import com.excellence.springboot_dto_tutorial.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users-location")
	public List<UserLocationDTO> getAllUsersLocation() {
		return userService.getAllUsersLocation();
	}
}

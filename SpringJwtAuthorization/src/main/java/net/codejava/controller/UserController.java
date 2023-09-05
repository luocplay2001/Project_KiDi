package net.codejava.controller;

import java.net.URI;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import net.codejava.dto.UserDTO;
import net.codejava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import net.codejava.entity.User;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired private UserService userService;

	@Autowired private PasswordEncoder passwordEncoder;

	@PutMapping
	public ResponseEntity<?> createUser(@RequestBody @Valid User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		User createdUser = userService.save(user);
		URI uri = URI.create("/users/" + createdUser.getId());
		
		UserDTO userDto = new UserDTO(createdUser.getId(), createdUser.getEmail());
		
		return ResponseEntity.created(uri).body(userDto);
	}
}

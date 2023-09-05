package net.codejava.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import net.codejava.dto.AuthRequest;
import net.codejava.dto.AuthResponse;
import net.codejava.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.config.jwt.JwtTokenUtil;
import net.codejava.entity.User;

@RestController
@Slf4j
public class AuthController {
	@Autowired AuthenticationManager authManager;

	@Autowired JwtTokenUtil jwtUtil;


	@PostMapping("/auth/login")
	public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request) {
		try {
			Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							request.getEmail(), request.getPassword())
			);
			
			User user = (User) authentication.getPrincipal();

			String accessToken = jwtUtil.generateAccessToken(user);
			AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
			return ResponseEntity.ok().body(response);
			
		} catch (BadCredentialsException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MessageResponse("Đăng nhập thất bại"));
		}
	}
}

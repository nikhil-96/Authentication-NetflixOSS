package com.user.authentication.dbservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@PostMapping("/register-user")
	public Boolean registerUser(@RequestBody User user) {
		Optional<User> u = userDetailsRepository.findById(user.getUsername());

		if(u.isPresent()) {
			if(u.get().getPassword().equals(user.getPassword())) {
				return false;
			} 
		}
		
		userDetailsRepository.save(user);
		return true;
	}
	
	@PostMapping("/login-user")
	public Boolean loginUser(@RequestBody User user) {
		Optional<User> u = userDetailsRepository.findById(user.getUsername());
		if(u.isPresent()) {
			if(u.get().getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}

}

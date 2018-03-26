package com.user.authentication.registerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@Autowired
	private DbServiceProxy proxy;
	
	@PostMapping("/users")
	public Boolean registerUser(@RequestBody User user) {
		return proxy.addUser(user);
	}

}

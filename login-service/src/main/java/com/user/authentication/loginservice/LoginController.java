package com.user.authentication.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	private DbServiceProxy proxy;
	
	@PostMapping("/login")
	public Boolean loginUser(@RequestBody User user) {
		return proxy.verifyUser(user);
	}

}

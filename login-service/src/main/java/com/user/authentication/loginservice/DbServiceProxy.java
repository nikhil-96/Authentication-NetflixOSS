package com.user.authentication.loginservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="zuul-gateway")
public interface DbServiceProxy {

	@PostMapping("/db-service/login-user")
	public Boolean verifyUser(@RequestBody User user);
	
}

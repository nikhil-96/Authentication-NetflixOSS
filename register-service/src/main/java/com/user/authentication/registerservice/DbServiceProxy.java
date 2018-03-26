package com.user.authentication.registerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="zuul-gateway")
public interface DbServiceProxy {

	@PostMapping("/db-service/register-user")
	public Boolean addUser(@RequestBody User user);
}

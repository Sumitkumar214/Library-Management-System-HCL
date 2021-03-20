package com.example.LMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LMS.Entity.AuthenticationBean;

@RestController
@RequestMapping("/Api")
public class BasicAuthController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicAuth(){
		return new AuthenticationBean("You are Authorized");
	}
}

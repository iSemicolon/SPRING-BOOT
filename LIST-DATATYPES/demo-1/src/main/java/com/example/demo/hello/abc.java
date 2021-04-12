package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abc {

	@RequestMapping("/hi")
	
	public String sayHi() {
		return "Good Morning";
	}
}

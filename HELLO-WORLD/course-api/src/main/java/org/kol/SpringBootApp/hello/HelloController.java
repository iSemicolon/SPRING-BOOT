package org.kol.SpringBootApp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloW")
	public String sayHi() {
		
		return "HelloWorld";
	}

}

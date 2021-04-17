package org.kol.FormApp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class MvcController {
	
	
	public String home() {
		System.out.println("Going Home.....");
		return "home";
	}
	
	
	

	
	@GetMapping(value = "/register")
	public String homeShow(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		
		User user=new User();
		 model.addAttribute("name", name);
		System.out.println("Going Homee.....");
		return "register_form";
	}

}

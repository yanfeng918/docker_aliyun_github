package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
	@ResponseBody
	public String list(Model model) {
		//model.addAttribute("page", jobService.find(request));
		//model.addAttribute("job", request);
		return "hello";
	}
}

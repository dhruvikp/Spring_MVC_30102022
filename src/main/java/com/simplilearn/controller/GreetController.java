package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greeting(Model model, @RequestParam(name="name", required=false, defaultValue="World!") String name) {
		// DO BUSINESS LOGIC
		
		// POPULATE MODEL
		model.addAttribute("name", name);
		
		// INVOKE VIEW
		return "hello";
	}
}
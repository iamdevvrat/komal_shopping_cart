package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
@RequestMapping("/springrest")
public class MyController {
	@GetMapping("/authenticate/{user}")
   public String home(@PathVariable String user) {
		if (user.equalsIgnoreCase("Admin"))
	   return "SuccessFully Logged in";
		else
		return "Not a valid user";
   }
	//get the items

	
	
}

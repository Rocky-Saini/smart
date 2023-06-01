package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.Contact;
import com.smart.entities.User;

@Controller
public class MyController {
	
	@Autowired
	private UserRepository userRepository;
       
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		 User user = new User();
	        user.setName("John");
	        user.setEmail("rocky@gmail.com");
	        
	        
	  			Contact contact = new Contact();

	  			 user.getContacts().add(contact);
	  	        userRepository.save(user);

	        userRepository.save(user);
		return "test";
	}
}

package com.noah.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/{somebody}")
	public String sayHi(@PathVariable(name = "somebody") String somebody){
		return "Hi " + somebody + ", I am from port " + port;
		
	}
	
}

package com.noah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noah.service.HiService;

@RestController
@RequestMapping("/hi")
public class HiController {
	
	@Autowired
	private HiService hiService;
	
	@RequestMapping("/{somebody}")
	public String sayHi(@PathVariable(name = "somebody") String somebody){
		
		return hiService.sayHi(somebody);
	}
	
}
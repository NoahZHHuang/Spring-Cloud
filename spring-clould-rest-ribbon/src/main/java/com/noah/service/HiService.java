package com.noah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@Service
public class HiService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="sayHiFallback")
	public String sayHi(String somebody){
		return restTemplate.getForObject("http://service-hi/hi/"+somebody, String.class);
	}
	
	public String sayHiFallback(String somebody){
		return "Hi "+ somebody+", sth wrong happened"; 
	}
	
}

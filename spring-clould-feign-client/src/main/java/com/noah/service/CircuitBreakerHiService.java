package com.noah.service;

import org.springframework.stereotype.Component;

@Component
public class CircuitBreakerHiService implements HiService {

	@Override
	public String sayHi(String somebody) {
		return "Sorry " + somebody + ", something wrong happen...";
	}

}

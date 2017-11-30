package com.noah.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="service-hi")
public interface HiService {


	@RequestMapping(value = "/hi/{somebody}", method = RequestMethod.GET)
	String sayHi(@PathVariable("somebody") String somebody);
	
}

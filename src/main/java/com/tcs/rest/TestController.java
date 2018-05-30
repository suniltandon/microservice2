package com.tcs.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="") 
public class TestController {

	@Value("${spring.application.name}")
	private String name;
	
	@RequestMapping(value="/testping", method = RequestMethod.GET)
	public String testPing() {
		return "Inside " + name;
	}
}

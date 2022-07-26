package com.demo.web.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	@Value("${message.value}")
    public String messageValue;

	@Value("${message.param}")
    public String messageParam;
	
	@GetMapping("/restapi")
	public String api() {
		System.out.println("messageValue>"+messageValue);
		System.out.println("messageParam>"+messageParam);
		String rtn = "messageValue>"+messageValue+"    messageParam>"+messageParam;
		return rtn;
	}

}

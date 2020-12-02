package com.Customers.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Customers.Model.CustomerModel;

@RestController
public class CustomerController {
	@GetMapping(path = "/hello")
	public String display() {
		return "hello world";
	}
	
	@GetMapping(path = "/m1")
	public CustomerModel somedioisplay() {
		return new CustomerModel("ashok", "inaganti", "adigoppula");
	}

}

package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.models.CustomerDetails;
import com.example.models.CustomerDetailsReq;
import com.example.service.CustomerDetailsService;
import com.example.service.CustomerService;

@RestController
public class WebController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerDetailsService customerDetailsService;

	@RequestMapping("/customerlist")
	public List<Customer> CustomerListAPI() {
		
		List<Customer> customerList = customerService.getCustomerList();
		return customerList;
	}
	
	@RequestMapping(value = "/customerdetailsapi", method = RequestMethod.POST)
	public CustomerDetails CustomerDetailsAPI(@RequestBody CustomerDetailsReq inputPayload) {
		
		int id = inputPayload.getId();
		
		CustomerDetails customerDetails = customerDetailsService.getCustomerDetails(id);
		return customerDetails;
	}

}

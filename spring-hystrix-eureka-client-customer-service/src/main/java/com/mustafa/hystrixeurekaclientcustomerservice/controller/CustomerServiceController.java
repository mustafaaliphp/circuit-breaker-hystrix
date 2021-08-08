package com.mustafa.hystrixeurekaclientcustomerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.mustafa.hystrixeurekaclientcustomerservice.delegate.CustomerServiceDelegate;

@RestController
public class CustomerServiceController {

	@Autowired
	CustomerServiceDelegate customerServiceDelegate;
	
	@RequestMapping(value = "/getCustomerShipmentDetails/{customername}", method = RequestMethod.GET)
	public String getCustomerShipmentDetails(@PathVariable String customername) {
		System.out.println("Getting School details for " + customername);
	
		return customerServiceDelegate.callShipmentServiceAndGetData(customername);
	}

	
}

package com.mustafa.hystrixeurekaclientcustomerservice.delegate;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class CustomerServiceDelegate {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "callShipmentServiceAndGetData_Fallback")
	public String callShipmentServiceAndGetData(String customername) {
		System.out.println("Getting Customer Shipment details for " + customername);
		String response = restTemplate
				.exchange("http://shipment-service/getShipmentDetailsForCustomer/{customername}"
				, HttpMethod.GET
				, null
				, new ParameterizedTypeReference<String>() {
			}, customername).getBody();

		System.out.println("Response Received as " + response + " -  " + new Date());

		return "NORMAL FLOW !!! - Customer Name -  " + customername + " :::  Shipment Details " + response + " -  " + new Date();
	}
	
	@SuppressWarnings("unused")
	private String callShipmentServiceAndGetData_Fallback(String customername) {
		System.out.println("Shipment Service is down!!! fallback route enabled...");
		return "CIRCUIT BREAKER ENABLED!!!No Response From Shipment Service at this moment. Service will be back shortly - " + new Date();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

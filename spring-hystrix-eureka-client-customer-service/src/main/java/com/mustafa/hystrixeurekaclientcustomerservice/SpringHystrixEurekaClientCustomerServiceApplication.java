package com.mustafa.hystrixeurekaclientcustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringHystrixEurekaClientCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixEurekaClientCustomerServiceApplication.class, args);
	}

}
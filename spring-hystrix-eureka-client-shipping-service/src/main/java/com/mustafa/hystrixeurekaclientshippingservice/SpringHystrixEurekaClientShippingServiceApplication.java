package com.mustafa.hystrixeurekaclientshippingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringHystrixEurekaClientShippingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixEurekaClientShippingServiceApplication.class, args);
	}

}

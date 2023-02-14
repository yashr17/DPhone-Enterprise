package com.dphone.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DphoneCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DphoneCustomerServiceApplication.class, args);
		System.out.println("Customer Application Started");
	}

}

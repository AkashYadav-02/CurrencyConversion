package com.microservice.currency_convrsion_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConvrsionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvrsionServiceApplication.class, args);
	}

}

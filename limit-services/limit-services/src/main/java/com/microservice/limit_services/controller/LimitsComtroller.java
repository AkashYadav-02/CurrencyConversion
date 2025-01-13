package com.microservice.limit_services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.limit_services.bean.Limits;
import com.microservice.limit_services.configuration.Configuration;

@RestController
public class LimitsComtroller {
	@Autowired
	private Configuration config;
	

	

	@GetMapping("/limits")
	public Limits retriveLimits() {

		return new Limits(this.config.getMinimum(),this.config.getMaximum());

	}
}

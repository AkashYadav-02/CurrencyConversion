package com.microservice.currency_exchange_service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	@Autowired
	private CurrencyExchangeRepository  repository;

	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchnageValue(@PathVariable String from, @PathVariable String to) {

//		CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(80));
 String port = env.getProperty("local.server.port");
	
		CurrencyExchange currencyExchange =repository.findByFromAndTo(from, to);
	
		if(currencyExchange==null)
		{
			throw new RuntimeException("Cannot find Data");
		}
		
		currencyExchange.setEnviourmnet(port);
		System.out.println("port"+ currencyExchange.toString());
		return currencyExchange;

	}
}

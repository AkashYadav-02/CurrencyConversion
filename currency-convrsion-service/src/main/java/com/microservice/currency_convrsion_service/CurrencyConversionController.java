package com.microservice.currency_convrsion_service;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	@Autowired
	private Environment env;

	@Autowired
	private CurrencyExchangeProxy proxy;
//	private CurrencyExchangeRepository  repository;
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConvesion(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {
//		 String port = env.getProperty("local.server.port");

		HashMap<String, String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);

		ResponseEntity<CurrencyConversion> currencyExhange = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariable);

		CurrencyConversion currencyCon = currencyExhange.getBody();

		BigDecimal result = currencyCon.getConversionMultiple().multiply(BigDecimal.valueOf(quantity));

		CurrencyConversion finalresult = new CurrencyConversion(currencyCon.getId(), from, to,
				currencyCon.getConversionMultiple(), BigDecimal.valueOf(quantity), result,
				currencyCon.getEnviourmnet());

		return finalresult;
	}
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConvesionUsingFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {
//		 String port = env.getProperty("local.server.port");


		CurrencyConversion currencyCon = proxy.retriveExchnageValue(from, to);

		BigDecimal result = currencyCon.getConversionMultiple().multiply(BigDecimal.valueOf(quantity));

		CurrencyConversion finalresult = new CurrencyConversion(currencyCon.getId(), from, to,
				currencyCon.getConversionMultiple(), BigDecimal.valueOf(quantity), result,
				currencyCon.getEnviourmnet());

		return finalresult;
	}

}

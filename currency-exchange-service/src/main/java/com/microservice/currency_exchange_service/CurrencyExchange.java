package com.microservice.currency_exchange_service;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity()
public class CurrencyExchange {
   @Id
	private long id;
   @Column(name = "from_currency")
	private String from;
   @Column(name = "to_currency")
	private String to;
	private BigDecimal conversionMultiple;
	public String enviourmnet;
	
	
	public CurrencyExchange() {
		super();
	}
	
	public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnviourmnet() {
		return enviourmnet;
	}

	public void setEnviourmnet(String enviourmnet) {
		this.enviourmnet = enviourmnet;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", enviourmnet=" + enviourmnet + "]";
	}
	
	
	
	
}

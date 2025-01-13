package com.microservice.currency_convrsion_service;

import java.math.BigDecimal;

public class CurrencyConversion {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal calculatedAmount;
    private String enviourmnet;  // Corrected the spelling to "environment"

    // Constructor
    public CurrencyConversion(long id, String from, String to, BigDecimal conversionMultiple, 
                              BigDecimal quantity, BigDecimal calculatedAmount, String enviourmnet) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.calculatedAmount = calculatedAmount;
        this.enviourmnet = enviourmnet;  // Corrected the spelling
    }

    // Default constructor
    public CurrencyConversion() {
        super();
    }

    // Getters and setters
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public String getEnviourmnet() {
        return enviourmnet;  // Corrected the spelling
    }

    public void setEnviourmnet(String enviourmnet) {
        this.enviourmnet = enviourmnet;  // Corrected the spelling
    }

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", quantity=" + quantity + ", calculatedAmount=" + calculatedAmount
				+ ", environment=" + enviourmnet + "]";
	}
    
}

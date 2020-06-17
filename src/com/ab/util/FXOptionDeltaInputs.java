package com.ab.util;

import java.time.LocalDate;


public class FXOptionDeltaInputs {
	
	private LocalDate valuationDate;
	private LocalDate expiryDate;
	private double strike;
	private BuySell buySell;
	private double volatility;
	private double forwardRate;
	private double depoBase;
	private String callCurrency;
	private String baseCurrency;
	
	public FXOptionDeltaInputs(LocalDate valuationDate, LocalDate expiryDate, double strike, BuySell buySell, double volatility,
			double forwardRate, double depoBase, String callCurrency, String baseCurrency) {
		
		this.valuationDate = valuationDate;
		this.expiryDate = expiryDate;
		this.strike = strike;
		this.buySell = buySell;
		this.volatility = volatility;
		this.forwardRate = forwardRate;
		this.depoBase = depoBase;
		this.callCurrency = callCurrency;
		this.baseCurrency = baseCurrency;
	}

	public LocalDate getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(LocalDate valuationDate) {
		this.valuationDate = valuationDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getStrike() {
		return strike;
	}

	public void setStrike(double strike) {
		this.strike = strike;
	}

	public BuySell getBuySell() {
		return buySell;
	}

	public void setBuySell(BuySell buySell) {
		this.buySell = buySell;
	}

	public double getVolatility() {
		return volatility;
	}

	public void setVolatility(double volatility) {
		this.volatility = volatility;
	}

	public double getForwardRate() {
		return forwardRate;
	}

	public void setForwardRate(double forwardRate) {
		this.forwardRate = forwardRate;
	}

	public double getDepoBase() {
		return depoBase;
	}

	public void setDepoBase(double depoBase) {
		this.depoBase = depoBase;
	}

	public String getCallCurrency() {
		return callCurrency;
	}

	public void setCallCurrency(String callCurrency) {
		this.callCurrency = callCurrency;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	
	
	
	

}

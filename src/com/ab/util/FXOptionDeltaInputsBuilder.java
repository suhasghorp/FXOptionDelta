package com.ab.util;

import java.time.LocalDate;
import java.util.Date;

public class FXOptionDeltaInputsBuilder {
	
	private LocalDate valuationDate;
	private LocalDate expiryDate;
	private double strike;
	private BuySell buySell;
	private double volatility;
	private double forwardRate;
	private double depoBase;
	private String callCurrency;
	private String baseCurrency;
	
	public FXOptionDeltaInputsBuilder(LocalDate valuationDate, LocalDate expiryDate, double strike, BuySell buySell,
			double volatility, double forwardRate, double depoBase, String callCurrency, String baseCurrency) {
		
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
	
	public FXOptionDeltaInputsBuilder() {}

	public FXOptionDeltaInputsBuilder setValuationDate(LocalDate valuationDate) {
		this.valuationDate = valuationDate;
		return this;
	}

	public FXOptionDeltaInputsBuilder setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public FXOptionDeltaInputsBuilder setStrike(double strike) {
		this.strike = strike;
		return this;
	}

	public FXOptionDeltaInputsBuilder setBuySell(BuySell buySell) {
		this.buySell = buySell;
		return this;
	}

	public FXOptionDeltaInputsBuilder setVolatility(double volatility) {
		this.volatility = volatility;
		return this;
	}

	public FXOptionDeltaInputsBuilder setForwardRate(double forwardRate) {
		this.forwardRate = forwardRate;
		return this;
	}

	public FXOptionDeltaInputsBuilder setDepoBase(double depoBase) {
		this.depoBase = depoBase;
		return this;
	}

	public FXOptionDeltaInputsBuilder setCallCurrency(String callCurrency) {
		this.callCurrency = callCurrency;
		return this;
	}

	public FXOptionDeltaInputsBuilder setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
		return this;
	}
	
	public FXOptionDeltaInputs build() {
		return new FXOptionDeltaInputs(valuationDate, expiryDate, strike, buySell, volatility, forwardRate, depoBase, callCurrency, baseCurrency);
	}
	
	
	
	

}

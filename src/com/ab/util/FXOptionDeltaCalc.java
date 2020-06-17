package com.ab.util;

import org.apache.commons.math3.distribution.NormalDistribution;

import com.ab.util.daycount.DayCountConvention_ACT_360;
import com.ab.util.daycount.DayCountConvention_ACT_ACT_YEARFRAC;

public class FXOptionDeltaCalc {
	
	FXOptionDeltaInputs inputs = null;
	
	DayCountConvention_ACT_ACT_YEARFRAC yearFrac1 = new DayCountConvention_ACT_ACT_YEARFRAC();
	DayCountConvention_ACT_360 yearFrac2 = new DayCountConvention_ACT_360();
	
	public FXOptionDeltaCalc(FXOptionDeltaInputs inputs) {
		this.inputs = inputs;
	}
	
	public FXOptionDeltaCalc() {}
	
	public void setInputs(FXOptionDeltaInputs inputs) {
		this.inputs = inputs;
	}
	
	public double getYearFrac1() {
		return yearFrac1.getDaycountFraction(inputs.getValuationDate(), inputs.getExpiryDate());
	}
	
	public double getYearFrac2() {
		return yearFrac2.getDaycountFraction(inputs.getValuationDate(), inputs.getExpiryDate());
	}
	
	public double d1() {
		return (1.0/(inputs.getVolatility()/100.0 * Math.sqrt(getYearFrac1()))) * (Math.log(inputs.getForwardRate()/inputs.getStrike())
				+ (0.5 * Math.pow((inputs.getVolatility()/100.0), 2) * getYearFrac1()));
	}
	
	public double deltaFwd() {
		double sub = inputs.getCallCurrency().equals(inputs.getBaseCurrency()) ? 0.0 : 1.0;
		return (inputs.getBuySell() == (BuySell.SELL) ? -1.0 : 1.0) * (new NormalDistribution(0.0, 1.0).cumulativeProbability(d1()) - sub) ;			
	}
	
	public double deltaSpot() {
		return deltaFwd()/(1.0 + inputs.getDepoBase()/100.0 * getYearFrac2());
	}
	
	
	
	
	

	

}

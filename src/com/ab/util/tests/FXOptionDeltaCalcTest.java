package com.ab.util.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.ab.util.BuySell;
import com.ab.util.FXOptionDeltaCalc;
import com.ab.util.FXOptionDeltaInputs;
import com.ab.util.FXOptionDeltaInputsBuilder;

class FXOptionDeltaCalcTest {
	private static final double DELTA = 1e-7;

	/*@ParameterizedTest(name = "{index} => inputs={0}, expected={1}")
	@ArgumentsSource(InputArgumentsProvider.class)
	void testD1(FXOptionDeltaInputs inputs, double expected) {			
		FXOptionDeltaCalc calc = new FXOptionDeltaCalc(inputs);
		assertEquals(expected, calc.d1(), DELTA);
										
	}
	
	@ParameterizedTest(name = "{index} => inputs={0}, expected={2}")
	@ArgumentsSource(InputArgumentsProvider.class)		
	void testDeltaFwd(FXOptionDeltaInputs inputs, double expected) {		
		FXOptionDeltaCalc calc = new FXOptionDeltaCalc(inputs);
		assertEquals(expected, calc.deltaFwd(), DELTA);
										
	}*/
	
	@ParameterizedTest(name = "{index} => inputs={0}, expected={1}")
	@ArgumentsSource(InputArgumentsProvider.class)		
	void testDeltaSpot(FXOptionDeltaInputs inputs, double expected) {		
		FXOptionDeltaCalc calc = new FXOptionDeltaCalc(inputs);
		assertEquals(expected, calc.deltaSpot(), DELTA);
										
	}

}

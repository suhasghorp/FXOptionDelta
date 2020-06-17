package com.ab.util.tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import com.ab.util.BuySell;
import com.ab.util.FXOptionDeltaInputsBuilder;

import java.time.LocalDate;
import java.util.stream.Stream;

public class InputArgumentsProvider implements ArgumentsProvider {
	 
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
        		
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(7.67)
						.setBuySell(BuySell.SELL)
						.setVolatility(24.5)
						.setForwardRate(7.6535)
						.setDepoBase(0.831)
						.setCallCurrency("USD")
						.setBaseCurrency("USD").build(),-0.5274375260),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(7.67)
						.setBuySell(BuySell.SELL)
						.setVolatility(24.5)
						.setForwardRate(7.6535)
						.setDepoBase(0.831)
						.setCallCurrency("TRY")
						.setBaseCurrency("USD").build(),0.4683331042),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(14.0)
						.setBuySell(BuySell.BUY)
						.setVolatility(24.5)
						.setForwardRate(7.6535)
						.setDepoBase(0.831)
						.setCallCurrency("USD")
						.setBaseCurrency("USD").build(),0.0003485990),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(14.0)
						.setBuySell(BuySell.BUY)
						.setVolatility(24.5)
						.setForwardRate(7.6535)
						.setDepoBase(0.831)
						.setCallCurrency("TRY")
						.setBaseCurrency("USD").build(),-0.9954220312),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(0.13)
						.setBuySell(BuySell.SELL)
						.setVolatility(24.5)
						.setForwardRate(0.1307)
						.setDepoBase(19.734)
						.setCallCurrency("TRY")
						.setBaseCurrency("TRY").build(),-0.4967698406),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(0.13)
						.setBuySell(BuySell.SELL)
						.setVolatility(24.5)
						.setForwardRate(0.1307)
						.setDepoBase(19.734)
						.setCallCurrency("USD")
						.setBaseCurrency("TRY").build(),0.4116086795),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(0.23817)
						.setBuySell(BuySell.BUY)
						.setVolatility(24.5)
						.setForwardRate(0.1307)
						.setDepoBase(19.734)
						.setCallCurrency("TRY")
						.setBaseCurrency("TRY").build(),0.0003444413),
                
                Arguments.of(new FXOptionDeltaInputsBuilder()
						.setValuationDate(LocalDate.of(2020, 4, 22))
						.setExpiryDate(LocalDate.of(2020, 10, 23))
						.setStrike(0.23817)
						.setBuySell(BuySell.BUY)
						.setVolatility(24.5)
						.setForwardRate(0.1307)
						.setDepoBase(19.734)
						.setCallCurrency("USD")
						.setBaseCurrency("TRY").build(),-0.9080340788)
                
        );
    }
}

package com.currency.controller;

import com.currency.model.CurrencyRates;

public class CurrencyController {
	
	//Currency added
	public CurrencyRates dollar = new CurrencyRates("dollar", "USD", 1);
	public CurrencyRates euro = new CurrencyRates("Euro", "EUR", 0.91);
	public CurrencyRates libraEst = new CurrencyRates("Libra Esterlina", "GBP", 0.79);
	public CurrencyRates jpnYen = new CurrencyRates("Japanese Yen", "JPY", 144.70);
	public CurrencyRates korWon = new CurrencyRates("Korean Won", "KRW", 1193.13);
	public CurrencyRates qtz = new CurrencyRates("quetazal", "QTZ", 7.86);
	
	public static double currencyConverter(CurrencyRates currentCurreny, CurrencyRates currencyTo, double quantity) {
		  
		double valorDestino = currencyTo.multiplicar(quantity);
		double valorOrigen = currentCurreny.getValor();
		double resultado = valorDestino / valorOrigen;
		return resultado;
		  
	}

}

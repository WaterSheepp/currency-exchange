package com.currency.model;

public class CurrencyRates {
	
	private String name;
	private String simbol;
	private double value;
	
	public CurrencyRates(String name, String simbol, double value) {
		this.name = name;
		this.simbol = simbol;
		this.value = value;
	}

	public String getNombre() {
		return name;
	}

	public String getSimbolo() {
		return simbol;
	}

	public double getValor() {
		return value;
	}
	
	public double multiplicar(double numero) {
	    return this.value * numero;
	}

	public double dividir(double numero) {
		return this.value / numero;
	}
	  

}

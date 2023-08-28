package com.currency.model;

public class CurrencyRates {
	
	protected double qtz = 1;
	protected double dollar = 0.13;
	protected double eur = 0.11;
	protected double libEst = 0.098;
	protected double jpnYen = 17.76;
	protected double korWon = 161.79;
	
	public double getQtz() {
		return qtz;
	}
	
	public void setQtz(double qtz) {
		this.qtz = qtz;
	}
	
	public double getDollar() {
		return dollar;
	}
	public double getEur() {
		return eur;
	}
	public double getLibEst() {
		return libEst;
	}
	public double getJpnYen() {
		return jpnYen;
	}
	public double getKorWon() {
		return korWon;
	}
	
}

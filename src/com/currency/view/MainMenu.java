package com.currency.view;

import java.text.DecimalFormat;


import javax.swing.JOptionPane;
import com.currency.model.CurrencyRates;
import com.currency.controller.CurrencyController;

public class MainMenu {
	
	public static void selectionMenu() {
		
		DecimalFormat df = new DecimalFormat("#.##");
		String[] currencyOption = { 
				"Dollar", 
				"Euro", 
				"Libra Esterlina",
				"Japanese Yen",
				"Korean Won",
				"QTZ"
				};
		
		String originCurrency = (String) JOptionPane.showInputDialog(
				null, 
				"Choose the currency you wish to convert", "Currency Converter", 
				JOptionPane.YES_NO_CANCEL_OPTION, null, 
				currencyOption, currencyOption[0]
			);
		
		String outputCurrency = (String) JOptionPane.showInputDialog(
				null, 
				"Choose the currency to which you wish to convert", "Currency Converter", 
				JOptionPane.YES_NO_CANCEL_OPTION, null, 
				currencyOption, currencyOption[1]
			);
		
		String input = JOptionPane.showInputDialog("Amount you wish to convert");
		double money = 0;
		
		try {
			
			money = Double.parseDouble(input);
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "You have entered an incorrect character, only numbers are accepted on this field, please try again!");
			selectionMenu();
			
		}
		
		CurrencyRates currency1 = new CurrencyRates("","",0);
		CurrencyController c = new CurrencyController();
		
		switch (originCurrency) {
			case "Dollar":
				currency1 = c.dollar;
				break;
			case "Euro":
				currency1 = c.euro;
				break;
			case "Libra Esterlina":
				currency1 = c.libraEst;
				break;
			case "Japanese Yen":
				currency1 = c.jpnYen;
				break;
			case "Korean Won":
				currency1 = c.korWon;
				break;
			case "QTZ":
				currency1 = c.qtz;
				break;
		}
		
		CurrencyRates currency2 = new CurrencyRates("","",0);
		CurrencyRates currencyName = new CurrencyRates(" "," ",0);
		
		switch (outputCurrency) {
			case "Dollar":
				currency2 = c.dollar;
				currencyName = c.dollar;
				break;
			case "Euro":
				currency2 = c.euro;
				currencyName = c.euro;
				break;
			case "Libra Esterlina":
				currency2 = c.libraEst;
				currencyName = c.libraEst;
				break;
			case "Japanese Yen":
				currency2 = c.jpnYen;
				currencyName = c.jpnYen;
				break;
			case "Korean Won":
				currency2 = c.korWon;
				currencyName = c.korWon;
				break;
			case "QTZ":
				currency2 = c.qtz;
				currencyName = c.qtz;
				break;
		}
		
		
		double convertion = CurrencyController.currencyConverter(currency1, currency2, money);
		JOptionPane.showMessageDialog(null, "The exchange rate would be " + df.format(convertion) + " " + currency2.getNombre() +"'s");
		mainMenu();
}
		
	
	public static void mainMenu() {
		
		Object[] possibleValues = { "Currency Exchange Rates", "wip"};
		
		Object selectedValue = JOptionPane.showInputDialog(null,
	             "Choose one", "Conversor Type",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);	
		
		if ( selectedValue == possibleValues[0]) { 
			
			selectionMenu();
			
		} else {
		
		JOptionPane.showMessageDialog(null, "gud day");	
		
	}	
}
	
	public static void main(String[] args) {
		
		mainMenu();
		
	}

}

package com.currency.model;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import com.currency.model.CurrencyRates;

public class Convertion {
	
	public static void selectionMenu() {
		
		DecimalFormat df = new DecimalFormat("#.##");
		CurrencyRates currency = new CurrencyRates();
		Object[] currencyOption = { 
				"QTZ to Dollar", 
				"QTZ to Euro", 
				"QTZ to Libra Esterlina",
				"QTZ to Japanese Yen",
				"QTZ to Korean Won"
				};
		String input = JOptionPane.showInputDialog("Quetzales to Convert to Other Currency");
		double money = 0;
		
		try {
			
			money = Double.parseDouble(input);
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "You have enter an incorrect character, only numbers are accepted on this field, please try again!");
			selectionMenu();
			
		}
	
		Object selectedCurrency = JOptionPane.showInputDialog(null,
	             "Choose one", "Currency Choice",
	             JOptionPane.INFORMATION_MESSAGE, null,
	             currencyOption, currencyOption[0]);
		
		
		if (selectedCurrency == currencyOption[0]) {
			
			double convertedMoney = currency.getDollar() * money;
			JOptionPane.showMessageDialog(null, "The exchange rate would be " + convertedMoney + " dollars");
			System.out.println(df.format(convertedMoney));
			mainMenu();
			
		} else if (selectedCurrency == currencyOption[1]) {
			
			double convertedMoney = currency.getEur() * money;
			JOptionPane.showMessageDialog(null, "The exchange rate would be " + convertedMoney + " euros");
			System.out.println(df.format(convertedMoney));
			mainMenu();
			
		} else if (selectedCurrency == currencyOption[2]) {
			
			double convertedMoney = currency.getLibEst() * money;
			JOptionPane.showMessageDialog(null, "The exchange rate would be " + convertedMoney + " Libra Esterlina");
			System.out.println(df.format(convertedMoney));
			mainMenu();
			
		} else if (selectedCurrency == currencyOption[3]) {
			
			double convertedMoney = currency.getJpnYen() * money;
			JOptionPane.showMessageDialog(null, "The exchange rate would be " + convertedMoney + " Japanese Yen's");
			System.out.println(df.format(convertedMoney));
			mainMenu();
			
		} else if (selectedCurrency == currencyOption[4]) {
			
			double convertedMoney = currency.getKorWon() * money;
			JOptionPane.showMessageDialog(null, "The exchange rate would be " + convertedMoney + " Korean Won's");
			System.out.println(df.format(convertedMoney));
			mainMenu();
			
		} 
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
		
		System.out.println("console mode");
		System.out.println("select an option");
		System.out.println("1. currency exchange rates convertion");
		System.out.println("2. wip");
		
		mainMenu();
		System.out.println(JOptionPane.INFORMATION_MESSAGE);
		
	}

}

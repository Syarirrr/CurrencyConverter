package com.example.CurrencyConverter.bus;

import com.example.CurrencyConverter.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.example.CurrencyConverter.model.*;


public class CurrencyResult {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Currency> list;
	
	public CurrencyResult () {
		Currency currencyMalaysia0 = new Currency ("United States (USD)", 0.24);
		Currency currencyMalaysia1 = new Currency ("United Kingdom (GBP)", 0.19);
		Currency currencyMalaysia2 = new Currency ("Singapore (SGD)", 0.33);
	
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		currenciesMap.put("Malaysia (MYR)", list);
		
		Currency currencyUnitedStates0 = new Currency ("Malaysia (MYR)", 4.19);
		Currency currencyUnitedStates1 = new Currency ("United Kingdom (GBP)", 0.78);
		Currency currencyUnitedStates2 = new Currency ("Singapore (SGD)", 1.37);
	
		list = new ArrayList<>();
		list.add(currencyUnitedStates0);
		list.add(currencyUnitedStates1);
		list.add(currencyUnitedStates2);
		currenciesMap.put("United States (USD)", list);
		
		Currency currencyUnitedKingdom0 = new Currency ("United States (USD)", 1.28);
		Currency currencyUnitedKingdom1 = new Currency ("Malaysia (MYR)", 5.35);
		Currency currencyUnitedKingdom2 = new Currency ("Singapore (SGD)", 1.75);
	
		list = new ArrayList<>();
		list.add(currencyUnitedKingdom0);
		list.add(currencyUnitedKingdom1);
		list.add(currencyUnitedKingdom2);
		currenciesMap.put("United Kingdom (GBP)", list);
		
		Currency currencySingapore0 = new Currency ("United States (USD)", 0.73);
		Currency currencySingapore1 = new Currency ("United Kingdom (GBP)", 0.57);
		Currency currencySingapore2 = new Currency ("Malaysia (MYR)", 3.06);
	
		list = new ArrayList<>();
		list.add(currencySingapore0);
		list.add(currencySingapore1);
		list.add(currencySingapore2);
		currenciesMap.put("Singapore (SGD)", list);
		
	}
		public ArrayList getCurrencyResult (String denomination) {
			return currenciesMap.get(denomination);
		}
}

package com.example.CurrencyConverter.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.CurrencyConverter.bus.CurrencyResult;
import com.example.CurrencyConverter.model.Currency;

@WebService
public class TestCurrency {
	CurrencyResult cr = new CurrencyResult();
	
	@WebMethod
	public ArrayList<Currency> getCurrencyResult (String denomination) {
		return cr.getCurrencyResult(denomination);
	}
}


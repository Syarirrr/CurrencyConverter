package com.example.CurrencyConverter.model;

public class Currency {
	
		private String CountryName;
		private Double currency;
		
		public Currency (String CountryName, Double currency)  {
			this.CountryName = CountryName;
			this.currency  = currency;
		}
		public String getCountryName() {
			return CountryName;
		}

		public void setCountryName(String CountryName) {
			this.CountryName = CountryName;
		}
		public Double getCurrency() {
			return currency;
		}

		public void setCurrency(Double currency) {
			this.currency = currency;
		}

	}


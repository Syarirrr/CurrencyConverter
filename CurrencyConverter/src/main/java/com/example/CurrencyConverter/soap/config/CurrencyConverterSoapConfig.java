package com.example.CurrencyConverter.soap.config;

	import javax.xml.ws.Endpoint;

	import org.apache.cxf.Bus;
	import org.apache.cxf.jaxws.EndpointImpl;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	import com.example.CurrencyConverter.soap.TestCurrency;

	@Configuration
	public class CurrencyConverterSoapConfig {
		@Autowired
		private Bus bus;
		
		@Bean
		public Endpoint endPoint() {
			Endpoint endpointImpl = new EndpointImpl(bus , new TestCurrency());
			endpointImpl.publish("/service");
			return endpointImpl;
}
	}

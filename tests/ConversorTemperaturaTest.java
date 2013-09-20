package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.ConversorTemperatura;

public class ConversorTemperaturaTest {

	ConversorTemperatura meuConversor;
	
	@Before
	public void setUp() throws Exception {
		
		meuConversor = new ConversorTemperatura();
		
	}

	@Test
	public void testCelsiusParaFahrenheit() {
		assertEquals(104,meuConversor.celsiusParaFahrenheit());
		
	}
	
	@Test
	public void testCelsiusParaFahrenheitValorInt() {
		assertEquals(104,meuConversor.celsiusParaFahrenheit(40));
		
	}
	
	@Test
	public void testCelsiusParaFahrenheitValorDouble() {
		assertEquals(104.0,meuConversor.celsiusParaFahrenheit(40.0),0.01);
		
	}
	
	@Test
	public void testFahrenheitParaCelsius() {
		assertEquals(10.5,meuConversor.fahrenheitParaCelsius(51.0),0.1);
		
	}
	
	@Test
	public void testCelsiusParaKelvin() {
		assertEquals(324.1,meuConversor.celsiusParaKelvin(51.1),0.01);
		
	}
	
	@Test
	public void testKelvinParaCelsius() {
		assertEquals(-221.9,meuConversor.kelvinParaCelsius(51.1),0.01);
		
	}
	
	@Test
	public void testFahrenheitParaKelvin() {
		assertEquals(283.61,meuConversor.fahrenheitParaKelvin(51.1),0.01);
		
	}
	
	@Test
	public void testKelvinParaFahrenheit() {
		assertEquals(-367.42,meuConversor.kelvinParaFahrenheit(51.1),0.01);
		
	}

}

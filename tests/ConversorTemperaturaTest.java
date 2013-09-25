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
	public void testCelsiusParaFahrenheitValorDouble() {
		assertEquals(80.6,meuConversor.celsiusParaFahrenheit(27.0),0.01);
		
	}
	
	@Test
	public void testFahrenheitParaCelsiusValorDouble() {
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

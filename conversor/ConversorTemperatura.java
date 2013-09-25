package conversor;

public class ConversorTemperatura {
	
	public double celsiusParaFahrenheit(double valorCelsius){
		return ((9*valorCelsius)/5) + 32;
		
	}
	
	public double fahrenheitParaCelsius(double valorFahrenheit){
		return (((valorFahrenheit-32)/9)*5);
		
	}
	
	public double celsiusParaKelvin(double valorCelsius){
		return valorCelsius + 273;
		
	}
	
	public double kelvinParaCelsius(double valorKelvin){
		return valorKelvin - 273;
		
	}
	
	public double fahrenheitParaKelvin(double valorFahrenheit){
		return (((valorFahrenheit-32)/9)*5) + 273;
		
	}
	
	public double kelvinParaFahrenheit(double valorKelvin){
		return (((valorKelvin-273)/5)*9)+32;
		
	}

}

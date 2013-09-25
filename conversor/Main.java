package conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		
		//Preparacao para leitura do teclado
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
		//Interacao com o usuario
		System.out.println("Digite qual conversão você deseja:");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Celsius");
		System.out.println("3 - Celsius para Kelvin");
		System.out.println("4 - Kelvin para Celsius");
		System.out.println("5 - Fahrenheit para Kelvin");
		System.out.println("6 - Kelvin para Fahrenheit");

        //Lendo a opcao digitada pelo usuario
		
		int opcaoLida = Integer.parseInt(leitor.readLine());
		
		System.out.println("Digite o valor que deseja converter:");
		
		double valorDigitado = Double.parseDouble(leitor.readLine());
		
		//Criando o conversor
		ConversorTemperatura meuConversor = new ConversorTemperatura();
		double resultadoConversao;
		
		//Menu de opcoes
		
		switch (opcaoLida){
		
		case 1:
		
			resultadoConversao =  meuConversor.celsiusParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " graus Celsius é " + resultadoConversao + " em Fahrenheit");
		
			break;
			
		case 2:
		
			resultadoConversao =  meuConversor.fahrenheitParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " graus Fahrenheit é " + resultadoConversao + "em Celsius");
		
			break;
			
		case 3:
		
			resultadoConversao =  meuConversor.celsiusParaKelvin(valorDigitado);
			System.out.println(valorDigitado + " graus Celsius é " + resultadoConversao + " em Kelvin");
		
			break;
			
		case 4:
		
			resultadoConversao =  meuConversor.kelvinParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " graus Kelvin é " + resultadoConversao + " em Celsius");
		
			break;
			
		case 5:
			
			resultadoConversao =  meuConversor.fahrenheitParaKelvin(valorDigitado);
		    System.out.println(valorDigitado + " graus Fahrenheit é " + resultadoConversao + " em Kelvin");
		  
		    break;
			
		case 6:
		
			resultadoConversao =  meuConversor.kelvinParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " graus Kelvin é " + resultadoConversao + " em Fahrenheit");
		
			break;
			
		default:
			
			System.out.println("Digite uma opcao valida:");
			break;
		
		}

	}

}

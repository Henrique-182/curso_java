// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
// ºC = (ºF - 32) / 1,8

package fundamentos.desafiosFinais;

import java.util.Scanner;

public class FahrenheitEmCelsius {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digit uma temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = entrada.nextDouble();
		
		double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8; 
		
		System.out.printf("%.2fºF = %.2fºC", temperaturaFahrenheit, temperaturaCelsius);
		
		entrada.close();
		
	}

}

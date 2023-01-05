// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
// ºF = ºC * 1,8 + 32

package fundamentos.desafiosFinais;

import java.util.Scanner;

public class CelsiusEmFahrenheit {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digit uma temperatura em Celsius: ");
		double temperaturaCelsius = entrada.nextDouble();
		
		double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
		
		System.out.printf("%.2fºC = %.2fºF", temperaturaCelsius, temperaturaFahrenheit);
		
		entrada.close();

	}

}

// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. 

package fundamentos.desafiosFinais;

import java.util.Scanner;

public class Exponenciacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = entrada.nextDouble();
		
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		
		System.out.printf("Número: %.2f", numero);
		System.out.printf("\nQuadrado: %.2f", quadrado);
		System.out.printf("\nCubo: %.2f", cubo);
		
		entrada.close();
	}
}

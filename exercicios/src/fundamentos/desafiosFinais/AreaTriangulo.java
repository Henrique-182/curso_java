// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

package fundamentos.desafiosFinais;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double areaTriangulo = base * altura / 2;
		
		System.out.printf("Base: %.2f", base);
		System.out.printf("\nAltura: %.2f", altura);
		System.out.printf("\nÁrea: %.2f", areaTriangulo);
		
		entrada.close();

	}

}

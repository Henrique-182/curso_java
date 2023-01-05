// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
// MENOR QUE 18,5	    MAGREZA	
// ENTRE 18,5 E 24,9	NORMAL	
// ENTRE 25,0 E 29,9	SOBREPESO	
// ENTRE 30,0 E 39,9	OBESIDADE	
// MAIOR QUE 40,0	    OBESIDADE GRAVE	

package fundamentos.desafiosFinais;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura em metros: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite seu peso em quilogramas: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
				
		System.out.printf("Altura: %.2f", altura);
		System.out.printf("\nPeso: %.2f", peso);
		System.out.printf("\nSeu IMC é %.2f", imc);
		
		entrada.close();
	}

}

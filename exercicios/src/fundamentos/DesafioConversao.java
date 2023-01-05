package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("1º salário: ");
		String salario1 = entrada.nextLine();
		salario1 = salario1.replace(",", ".");
		double s1 = Double.parseDouble(salario1); 
		
		System.out.print("2º salário: ");
		String salario2 = entrada.nextLine();
		salario2 = salario2.replace(",", ".");
		double s2 = Double.parseDouble(salario2); 
		
		System.out.print("3º salário: ");
		String salario3 = entrada.nextLine();
		salario3 = salario3.replace(",", ".");
		double s3 = Double.parseDouble(salario3); 
		
		System.out.printf("1º salário: R$%f", s1);
		System.out.printf("\n2º salário: R$%f", s2);
		System.out.printf("\n3º salário: R$%f", s3);
		
		double soma = s1 + s2 + s3;
		double media = soma / 3;
		
		System.out.printf("\nMédia: R$%f", media);
		
		entrada.close();
	}

}

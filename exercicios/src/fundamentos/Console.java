package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print("dia\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: R$%.1f\n", 1234.56767);
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome:" + nome + " possui " + idade + " anos");
		
		entrada.close();
	}

}

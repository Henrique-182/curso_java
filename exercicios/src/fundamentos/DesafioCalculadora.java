package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("1º número: ");
		int n1 = entrada.nextInt();
		
		System.out.print("2º número: ");
		int n2 = entrada.nextInt();
		
		System.out.print("Operação: ");
		String operacao = entrada.next();
		
		boolean operacaoSoma = operacao.equals("+");
		boolean operacaoSubtracao = operacao.equals("-");
		boolean operacaoMultiplicacao = operacao.equals("*");
		boolean operacaoDivisao = operacao.equals("/");
		boolean operacaoRestoDivisao = operacao.equals("%");
		
		int resultado = operacaoSoma ? (n1+n2) : 
			operacaoSubtracao ? (n1-n2) : 
				operacaoMultiplicacao ? (n1*n2) : 
					operacaoDivisao ? (n1/n2) : 
						operacaoRestoDivisao ? (n1%n2) :
							0;
		
		System.out.printf("%d %s %d = %d", n1, operacao, n2, resultado);
		
		entrada.close();

	}

}

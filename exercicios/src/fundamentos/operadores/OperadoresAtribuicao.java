package fundamentos.operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = b + a;
		
		c += b; // c = c + b
		c -= a; // c = c - a
		c *= b; // c = c * b
		c /= a; // c = c / a
		c %= 2; // c = c % 2
		
		System.out.println(c);
	}

}

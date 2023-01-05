package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		int a = 6 * (3 + 2);
		a = (int) Math.pow(a, 2);
		a = a / (3 * 2);
		
		int b = (1 - 5) * (2 - 7);
		b = b / 2;
		b = (int) Math.pow(b, 2);
		
		int c = a - b;
		c = (int) Math.pow(c, 3);

		int d = (int) (c / Math.pow(10, 3));
		
		System.out.println(d);
		
	}
}

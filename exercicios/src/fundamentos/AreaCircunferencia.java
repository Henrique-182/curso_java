package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.1415;
		
		double area = PI * raio * raio;
		
		System.out.println("A área vale " + area + "cm²");
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("A área vale " + area + "cm²");
	}
}

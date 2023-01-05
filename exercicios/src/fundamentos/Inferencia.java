package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		c = "outro texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d = 123.45; // variável foi inicializada
		System.out.println(d); // usada!
		
		var e = 123.45;
		System.out.println(e);
	}
}

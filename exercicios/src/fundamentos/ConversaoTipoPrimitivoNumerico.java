package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		// conversão implícita 
		double a = 1;
		System.out.println(a);
		
		// conversão explícita (CAST)
		float b = (float) 1.123456789123456789;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}

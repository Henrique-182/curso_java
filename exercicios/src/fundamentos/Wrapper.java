package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Integer ii = Integer.parseInt("1000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(ii);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bb = Boolean.parseBoolean("true");
		System.out.println(bb);
		
		Character c = '#';
		System.out.println(c);
	}

}

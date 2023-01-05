package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia Henrique";
		
		s = s.replace("Henrique", "Ricardo");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Henrique".toUpperCase());
		
		String y = "Bom dia Henrique".replace("Henrique", "Marina");
		System.out.println(y);
	}
}

package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// C = (F - 32) * 5/9
		final double n1 = 32.0;
		final double n2 = 5.0/9.0;
		
		double temperaturaFahrenheit = 86.0;
		double temperaturaCelsius = (temperaturaFahrenheit - n1) * n2;
		
		System.out.println(temperaturaFahrenheit + "ºF = " + temperaturaCelsius + "ºC");
	}
}

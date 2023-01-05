package fundamentos.operadores;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Dois trabalhos derem certo = TV 50"
		// Um trabalho der certo = TV 32"
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = true;
		
		System.out.println("Trabalho na terça deu certo? " + trabalhoTerca);
		System.out.println("Trabalho na quinta deu certo? " + trabalhoQuinta);
		System.out.println();
		
		// Televisão
		if (trabalhoTerca && trabalhoQuinta) {
			System.out.println("Comprar televisão de 50\"");
		} else if (!trabalhoTerca && !trabalhoQuinta) {
			System.out.println("Não comprar nenhuma televisão");
		} else {
			System.out.println("Comprar televisão de 32\"");	
		}
		
		// Sorvete
		if (trabalhoTerca || trabalhoQuinta) {
			System.out.println("Tomar sorvete");
		} else {
			System.out.println("Não tomar sorvete");
		}
		
		// Saudável
		if (!trabalhoTerca && !trabalhoQuinta) {
			System.out.println("Saudável, pois não tomou sorvete");
		} else {
			System.out.println("Não saudável, pois tomou sorvete");
		}
	}

}

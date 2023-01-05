// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula 
// de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. 
// Encontre o delta

package fundamentos.desafiosFinais;

public class DeltaEquacaoSegundoGrau {

	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("A: %d", a);
		System.out.printf("\nB: %d", b);
		System.out.printf("\nC: %d", c);
		System.out.printf("\nDelta: %d", delta);

	}

}

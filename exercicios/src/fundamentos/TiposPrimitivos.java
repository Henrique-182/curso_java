package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionário
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerodeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		
		// tipo caractere
		char status = 'A';
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// número de viagens
		System.out.println(numerodeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// id
		System.out.println("O id " + id + " ganha R$" + salario);
		
		// férias
		System.out.println("Está de férias? " + estaDeFerias);
		
		// status
		System.out.println("Status: " + status);
	}
}

package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		
		Aluno a1 = new Aluno(123456798L, "Henrique");
		Aluno a2 = new Aluno(987654321L, "Marina");
		AlunoBolsista a3 = new AlunoBolsista(234567891L, "Ricardo", 300.0);
		AlunoBolsista a4 = new AlunoBolsista(876543219L, "Tatiana", 250.0);
		
		dao.incluirAtomico(a1);
		dao.incluirAtomico(a2);
		dao.incluirAtomico(a3);
		dao.incluirAtomico(a4);
		
		dao.fecharDAO();

	}

}

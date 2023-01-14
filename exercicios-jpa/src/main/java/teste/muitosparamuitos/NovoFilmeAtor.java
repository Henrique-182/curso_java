package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme f1 = new Filme("Star Wars Ep 4", 8.7);
		Filme f2 = new Filme("O Fugitivo", 8.3);
		
		
		Ator a1 = new Ator("Harrison Ford");
		Ator a2 = new Ator("Carrie Fisher");

		f1.adicionarAtor(a1);
		f1.adicionarAtor(a2);
		
		f2.adicionarAtor(a1);
		
		DAO<Filme> dao = new DAO<>();
		
		dao.incluirAtomico(f1); // como o ator está com a estratégia PERSIST, o filme f2 também será incluído
		
		dao.fecharDAO();
	}

}

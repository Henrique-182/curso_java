package teste.heranca_desafio;

import infra.DAO;
import modelo.heranca_desafio.Pessoa;
import modelo.heranca_desafio.PessoaFisica;
import modelo.heranca_desafio.PessoaJuridica;

public class CriarPessoa {


	public static void main(String[] args) {
		Pessoa p1 = new PessoaFisica("Henrique", "628.356.330-90");
		Pessoa p2 = new PessoaFisica("Marina", "462.599.970-78");
		Pessoa p3 = new PessoaFisica("Ricardo", "424.640.920-02");
		Pessoa p4 = new PessoaJuridica("Isadora", "40.120.758/0001-88");
		Pessoa p5 = new PessoaJuridica("Matheus", "88.739.558/0001-34");
		Pessoa p6 = new PessoaJuridica("Tatiana", "27.776.927/0001-74");


		DAO<Object> dao = new DAO<>();
		
		dao.incluirAtomico(p1);
		dao.incluirAtomico(p2);
		dao.incluirAtomico(p3);
		dao.incluirAtomico(p4);
		dao.incluirAtomico(p5);
		dao.incluirAtomico(p6);
		
		dao.fecharDAO();
	}


}


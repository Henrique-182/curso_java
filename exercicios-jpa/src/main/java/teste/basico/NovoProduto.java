package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Fone de Ouvido", 200.0);
		
		// dao.incluirAtomico(produto); ou
		dao.abrirTransaction();
		dao.incluir(produto);
		dao.fecharTransaction();
		
		dao.fecharDAO();
		
	}

}

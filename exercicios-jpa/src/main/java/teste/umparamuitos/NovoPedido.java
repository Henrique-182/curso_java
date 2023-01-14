package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 3000.0);
		ItemPedido item = new ItemPedido(pedido, produto, 2);

		dao.abrirTransaction().incluir(produto).incluir(pedido).incluir(item).fecharTransaction();
		
		dao.fecharDAO();
	}

}

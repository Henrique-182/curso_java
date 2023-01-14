package teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1L);
		
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getNome());
		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(1L);
		
		System.out.println(assento.getCliente().getNome());
		
		daoCliente.fecharDAO();
		daoAssento.fecharDAO();
	}

}

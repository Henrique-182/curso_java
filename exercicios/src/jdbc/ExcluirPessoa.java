package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		int codigo = 1;
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() == 1) {
			System.out.println("Pessoa excluída");
		} else {
			System.out.println("Pessoa não excluída ou não existente");
		}
		
		conexao.close();

	}

}

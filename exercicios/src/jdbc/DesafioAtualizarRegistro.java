package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		System.out.print("Digite o codigo: ");
		int codigo = entrada.nextInt();
		
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) {
			System.out.println(resultado.getInt("codigo") + " | " + resultado.getString("nome"));		
			entrada.nextLine();
			
			System.out.print("Digite o nome novo: ");
			String nomeNovo = entrada.nextLine();
			
			stmt.close();
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nomeNovo);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome modificado");
			
		} else {
			System.out.println("Nome não encontrado");
		}
		
		stmt.close();
		entrada.close();
		conexao.close();
	}

}

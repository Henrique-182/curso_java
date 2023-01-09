package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		
		
		System.out.print("Parâmetro: ");
		String parametro = entrada.nextLine();
		
		entrada.close();
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + parametro + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		System.out.println("Resultado a partir do parâmetro: " + parametro);
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			System.out.println("Código: " + codigo + " | nome: " + nome);
		}
		
		stmt.close();
		conexao.close();
	}

}

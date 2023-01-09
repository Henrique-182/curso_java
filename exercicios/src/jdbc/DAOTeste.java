package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Isadora"));
		dao.incluir(sql, "Ku Shay Shang");

		dao.close();
	}

}

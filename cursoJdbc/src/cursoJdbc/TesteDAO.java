package cursoJdbc;

public class TesteDAO {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Fernanda", 250);
		
		dao.close();
	}

}

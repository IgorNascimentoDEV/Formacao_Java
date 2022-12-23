package cursoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/loja_virtual?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "root";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Execucao feita com sucesso");
		conexao.close();
	}

}

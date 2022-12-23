package cursoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
			
		conexao.close();
	}

}

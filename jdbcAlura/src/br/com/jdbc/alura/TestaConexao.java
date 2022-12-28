package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conexao1 = new ConnectionFactory();
		Connection conexao = conexao1.recuperaConexao();

		conexao.close();
	}

}

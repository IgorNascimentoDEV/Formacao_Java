package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaPoolConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conexao1 = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
			Connection conexao = conexao1.recuperaConexao();
			System.out.println("Conexao abertas" + i);
		}
		
	}
}

package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao1 = new ConnectionFactory();
		Connection conexao = conexao1.recuperaConexao();

		PreparedStatement stm = conexao.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();

		ResultSet resultado = stm.getResultSet();

		while (resultado.next()) {
			Integer id = resultado.getInt("ID");
			String nome = resultado.getString("NOME");
			String descricao = resultado.getString("DESCRICAO");

			System.out.println(id + " " + nome + " " + descricao);

		}

		conexao.close();

	}

}

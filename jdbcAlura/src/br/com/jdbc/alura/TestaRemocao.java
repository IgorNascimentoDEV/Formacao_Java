package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao1 = new ConnectionFactory();
		Connection conexao = conexao1.recuperaConexao();
		int id = 10;
		PreparedStatement stm = conexao.prepareStatement("DELETE FROM PRODUTO WHERE ID  > ?");
		stm.setInt(1, id);

		stm.execute();

		int linhasModificadas = stm.getUpdateCount();

		System.out.println("linhas modificadas: " + linhasModificadas);
	}
}

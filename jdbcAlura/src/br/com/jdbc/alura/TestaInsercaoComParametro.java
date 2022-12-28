package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conexao1 = new ConnectionFactory();
		
		try (Connection conexao = conexao1.recuperaConexao();) {
			conexao.setAutoCommit(false);

			try (PreparedStatement stm = conexao.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS);) {
				adicionarVariavel("Radio", "Radio do castelo", stm);
				adicionarVariavel("playstation2", "original", stm);

				conexao.commit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				conexao.rollback();
			}

		}
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		stm.execute();

		try (ResultSet resultado = stm.getGeneratedKeys()) {
			while (resultado.next()) {
				Integer id = resultado.getInt(1);
				System.out.println("Produto inserido id: " + id);
			}
		}

	}
}

package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conexao1 = new ConnectionFactory();
		Connection conexao = conexao1.recuperaConexao();

		Statement stm = conexao.createStatement();
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Teclado', 'Teclado sem fio')", Statement.RETURN_GENERATED_KEYS);

		ResultSet resultado =stm.getGeneratedKeys();
	
		
		while(resultado.next()) {
			Integer id = resultado.getInt(1);
			System.out.println(id);
		}
	}

}

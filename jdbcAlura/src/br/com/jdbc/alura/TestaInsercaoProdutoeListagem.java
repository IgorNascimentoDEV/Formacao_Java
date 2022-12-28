package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.alura.modelo.Produto;
import dao.ProdutoDAO;

public class TestaInsercaoProdutoeListagem {

	public static void main(String[] args) throws SQLException {
		Produto prod = new Produto("arroz", "arroz branco" );
		
		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			produtoDAO.salvar(prod);
			
			List<Produto> listadeProdutos = produtoDAO.listar();
			listadeProdutos.stream().forEach(lp->System.out.println(lp));
		}
	
	}
}

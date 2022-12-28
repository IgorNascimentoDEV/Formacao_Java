package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.alura.modelo.Categoria;
import br.com.jdbc.alura.modelo.Produto;
import dao.CategoriaDAO;

public class TestaListagemDeCategoria {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategoria = categoriaDAO.listarComProdutos();

			listaDeCategoria.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				for (Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
		}

	}
}

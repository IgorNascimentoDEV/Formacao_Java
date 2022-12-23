package cursoJdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

	private int codigo;
	private String nome;

	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void buscaPorNome() throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual nome devera se buscado no banco?");
		String nomePassado = leitor.nextLine();

		String sql = "SELECT * FROM pessoas WHERE nome LIKE '%" + nomePassado + "%'";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + "-->" + pessoa.getNome());
		}
		
		conexao.close();
	}
	
	public static void buscarPorId() throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o id da pessoa que deseja alterar");
		int id = leitor.nextInt();
		
		String sqlSelect = "SELECT * FROM pessoas WHERE codigo = " + id;
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sqlSelect);

		
		if(resultado.next()) {
			Pessoa p1 = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));	
			System.out.println("O nome atual e: " + p1.getNome() );
			leitor.nextLine();
			
			System.out.println("Digite o novo nome");
			String novoNome = leitor.nextLine();
			
			String sqUpdate = "UPDATE pessoas SET nome = '" + novoNome + "' WHERE codigo = " + id;
			stmt.close();
			stmt = conexao.createStatement();
			stmt.execute(sqUpdate);
			System.out.println("pessoa alterda com sucesso");
		}else {
			System.out.println("Pessoa nao encontrada");
		}
		
		
		conexao.close();	
	}
	
	
	@Override
	public String toString() {
		return nome + " " + codigo ;
	}
}

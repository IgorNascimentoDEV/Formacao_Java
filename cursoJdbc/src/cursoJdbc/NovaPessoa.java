package cursoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome");
		String nome = entrada.nextLine();

		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')";
		PreparedStatement stmt = conexao.prepareStatement(sql); 

		stmt.execute(sql);
		
		
		System.out.println("Cadastro realizado com sucesso");
		entrada.close();
	}

}

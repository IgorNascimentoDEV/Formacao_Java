package cursoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o codigo: ");
		int id= entrada.nextInt();
	
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "DELETE FROM pessoas WHERE codigo >" + id;	
		PreparedStatement stmt = conexao.prepareStatement(sql); 
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com Sucesso");
		}else {
			System.out.println("Error ao excluir tente novamente");
		}
		conexao.close();
		entrada.close();
		
	}
}

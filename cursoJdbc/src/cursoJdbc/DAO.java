package cursoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conexao;

	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
		int indice = 1;
		for (Object object : atributos) {
			if(object instanceof String) {
				stmt.setString(indice, (String)object);				
			}else if(object instanceof Integer) {
				stmt.setInt(indice, (Integer)object);
			}			
			indice++;
		}
	}

	private Connection getConexao() {
		conexao = FabricaConexao.getConexao();
		try {
			if (conexao != null && !conexao.isClosed())
				;
			return conexao;
		} catch (SQLException e) {

			e.printStackTrace();
		}

	
		return conexao;

	}
	
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			conexao = null;
		}
	}
}

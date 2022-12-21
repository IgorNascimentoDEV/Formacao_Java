package javaPilha;

public class TesteConexao {

	public static void main(String[] args) {
		
		//-----------TRY SIMPLIFICADO-----------
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(Exception ex){
			System.out.println("Deu erro na conexao");
		}
		
		
		//------------TRY NORMAL----------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(Exception ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			if(con != null) {
//				con.close();				
//			}
//		}

	}

}

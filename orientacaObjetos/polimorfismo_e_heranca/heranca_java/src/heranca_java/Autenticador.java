package heranca_java;

public class Autenticador {
	private int senha;
	
	//contrato da interface

		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			}else {
				return false;
			}	
		}
		

		public void setSenha(int senha) {
			this.senha = senha; 
			
		}
}

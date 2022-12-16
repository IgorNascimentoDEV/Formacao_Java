package heranca_java;

public class Gerente extends Funcionario implements Autenticavel{

	private Autenticador autenticador;

	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	//metodos
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	//contrato da interface
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
}

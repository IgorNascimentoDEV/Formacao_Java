package heranca_java;

public class ControleBonificacao {
	
	private double soma;
	

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}
	
}

package heranca_java;

public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Igor");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Gerente();
		f1.setSalario(5000.00);
		
		EditorDeVideo e1 = new EditorDeVideo();
		e1.setSalario(5000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());

	}

}

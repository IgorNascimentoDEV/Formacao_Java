package bytebankCliente;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(100);
		
		conta.sacar(200);
		
		System.out.println(conta.getSaldo());
		
		
		conta.setNumero(696969);
		
		System.out.println(conta.getNumero());
		
		Cliente igor = new Cliente();
		igor.setNome("Igor Nascimento");
		conta.setTitular(igor);
		
		System.out.println(conta.getTitular().getNome());
	}
}

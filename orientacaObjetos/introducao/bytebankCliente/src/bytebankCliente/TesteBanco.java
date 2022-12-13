package bytebankCliente;

public class TesteBanco {
	public static void main(String[] args) {
		Cliente igor = new Cliente();
		
		igor.setCpf("159951357753");
		igor.setNome("Igor");
		
		
		Conta contaDoIgor = new Conta(1, 2);
		
		contaDoIgor.depositar(100);
		
		// associa o cliente igor para a conta igor
		contaDoIgor.setTitular(igor);
		
		System.out.println(contaDoIgor.getTitular().getNome());
	}
}

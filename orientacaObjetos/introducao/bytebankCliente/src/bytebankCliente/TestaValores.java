package bytebankCliente;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(12, 59);
		Conta conta2 = new Conta(13, 60);
		Conta conta3 = new Conta(14, 610);
		
		System.out.println(Conta.getTotal());
	}
}

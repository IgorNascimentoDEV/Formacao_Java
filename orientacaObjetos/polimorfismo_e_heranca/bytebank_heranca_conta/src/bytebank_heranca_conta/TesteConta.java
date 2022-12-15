package bytebank_heranca_conta;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(100);
		
		ContaPoupaca cp = new ContaPoupaca(222, 222);
		cp.depositar(200);
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto cal = new CalculadorDeImposto();
		cal.registra(cc);
		cal.registra(seguro);
			
		System.out.println(cal.getTotalImposto());
		
	}

}

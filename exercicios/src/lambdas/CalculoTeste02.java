package lambdas;

public class CalculoTeste02 {

	public static void main(String[] args) {
		
		Calculo calc = ( x, y) -> { return x / y; };
		
		System.out.println(calc.executar(5, 5));
		
		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(2, 2));
	}
}

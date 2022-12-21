package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(12, 100);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(13, 101);
		contas[1] = cc2;
		
		ContaPoupanca cp1 = new ContaPoupanca(23, 201);
		contas[2] = cp1;
		
//		for(ContaCorrente item: contas) {
//			System.out.println(item);
//		}
		
		Conta ref = contas[1];
		System.out.println(ref.getNumero());
	
		Conta ref2 = contas[2];
		System.out.println(ref.getNumero());
		
		Object[] objetos = new Object[5];//Array de diversos objetos
	}
}

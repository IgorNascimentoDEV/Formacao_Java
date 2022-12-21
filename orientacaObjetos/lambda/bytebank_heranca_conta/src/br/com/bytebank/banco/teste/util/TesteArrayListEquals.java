package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(123, 456);
//		Conta cc2 = new ContaCorrente(123, 456);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
//		List<Conta> lista = new LinkedList<Conta>();
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(123, 456);
		Conta cc2 = new ContaCorrente(183, 458);
		
		lista.add(cc);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(183, 458);
		boolean existe = lista.contains(cc3);
		System.out.println(existe);
		

		
		
	}
	
}

package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		int idade = 29;
		Integer idadeRef =  Integer.valueOf(idade);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
	
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
	}
	
}
package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef =  Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.intValue());
		
		List<Number> lista = new ArrayList();
		
		lista.add(dRef);
		lista.add(idadeRef);
		
		for(Number item: lista) {
			System.out.println(item);
		}
		
	}
}

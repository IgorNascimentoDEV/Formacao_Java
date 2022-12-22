package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de lista";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		//System.out.println(aulas);

		aulas.remove(0);

		//System.out.println(aulas);

		for (String item : aulas) {
			System.out.println("Aula: " + item);
		}

//		String primeiraAula = aulas.get(0);
//		System.out.println("A primeira aula é: " + primeiraAula);
//
//		aulas.forEach(aula -> {
//			System.out.println("Pecorrendo: ");
//			System.out.println("Aula " + aula);
//		});

		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);

		for (String item : aulas) {
			System.out.println("Aula: " + item);
		}
	}
}
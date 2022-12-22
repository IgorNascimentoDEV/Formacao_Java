package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso ("Dominando as coleções do java", "Paulo Silveira");

		
		javaColecoes.adiciona(new Aula ("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula ("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula ("Modelando com coleçoes", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("Tempo total do curso: " + javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
	
	
}

package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Igor");
		alunos.add("Isabele");
		alunos.add("Leandro");
		alunos.add("Iris");
		alunos.add("Isis");
		alunos.add("Negao");
		alunos.add("Zangada");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.remove("Negao");
		boolean igorEstaAi = alunos.contains("Igor");
		
		System.out.println(igorEstaAi);
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}
}

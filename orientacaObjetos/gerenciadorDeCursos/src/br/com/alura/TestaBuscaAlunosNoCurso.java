package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleçoes", 24));

		Aluno a1 = new Aluno("Igor Nascimento", 315489);
		Aluno a2 = new Aluno("Ruben Sostenes", 171819);
		Aluno a3 = new Aluno("Ruan Riquelme", 123698);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno com matricula 171819?");
		Aluno aluno = javaColecoes.buscaMatriculado(123698);
		System.out.println("aluno " + aluno);
	}
}

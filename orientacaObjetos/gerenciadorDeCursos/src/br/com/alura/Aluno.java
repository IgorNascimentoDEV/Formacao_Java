package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// construtores
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	// metodos acessores
	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno: " + this.nome + ", matricula " + this.numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome == outro.getNome();
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}

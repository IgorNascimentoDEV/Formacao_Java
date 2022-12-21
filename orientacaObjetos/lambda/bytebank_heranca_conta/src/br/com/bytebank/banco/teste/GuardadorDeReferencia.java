package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class GuardadorDeReferencia {
	private Object[] referencias;
	private int posicaoLivre;
	
	
	
	public GuardadorDeReferencia () {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	
	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}


	public int getQuantidadeDeElementos() {
		
		return posicaoLivre;
	}


	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}

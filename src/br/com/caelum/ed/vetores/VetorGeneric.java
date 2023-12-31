package br.com.caelum.ed.vetores;

public class VetorGeneric {
	
	private Object[] objetos = new Object[100];
	private int totalDeObjetos = 0;
	
	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, Object objeto) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = this.totalDeObjetos - 1; i >= posicao; i-=1) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = objeto;
		this.totalDeObjetos++;
	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}
	
	public boolean contem(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (objeto == this.objetos[i]) {
				return true;
			}
		}
		return false;
	}
	
	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!!");
		}
		return this.objetos[posicao];
	}
	
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!!");
		}
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}
	
	public void remove(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			if (objeto == this.objetos[i]) {
				this.objetos[i] = this.objetos[i + 1];
			}
			this.totalDeObjetos--;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}
	
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	private void garantaEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novoArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novoArray[i] = this.objetos[i];
			}
			this.objetos = novoArray;
		}
	}

}

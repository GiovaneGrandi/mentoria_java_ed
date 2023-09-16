package br.com.caelum.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoParametrizado<T> {
	
	private List<List<T>> tabela = new ArrayList<List<T>>();
	private int tamanho = 0;
	
	public ConjuntoEspalhamentoParametrizado() {
		for (int i = 0; i < 26; i++) {
			LinkedList<T> lista = new LinkedList<T>();
			tabela.add(lista);
		}
	}
	
	private int calculaIndiceDaTabela(T objeto) {
		int codigoDeEspalhamento = objeto.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % tabela.size();
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<T> objetos = this.pegaTodos();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<T>());
		}
		
		for (T objeto : objetos) {
			this.adiciona(objeto);
		}
	}
	
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	public boolean contem(T objeto) {
		int indice = this.calculaIndiceDaTabela(objeto);
		List<T> lista = this.tabela.get(indice);
		
		return lista.contains(objeto);
	}
	
	public void adiciona(T objeto) {
		if (!this.contem(objeto)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.add(objeto);
			this.tamanho++;
		}
	}
	
	public List<T> pegaTodos() {
		List<T> palavras = new ArrayList<T>();
		
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		
		return palavras;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void remove(T objeto) {
		if (this.contem(objeto)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.remove(objeto);
			this.tamanho--;
		}
	}
	
	public void imprimeTabela() {
		for (List<T> lista : this.tabela) {
			System.out.println("[");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("*");
			}
			System.out.println("]");
		}
	}

}

package br.com.caelum.ed.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {

	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		
		int numeroDeElementos = 40000;
		
		//Adicionando itens no início:
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.add(0, "" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Vetor adiciona no começo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.add(0, "" + i);
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Lista Ligada adiciona no começo: " + (fim - inicio) / 1000.0);
		
		//Percorrendo os itens:
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.get(i);
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.get(i);
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Lista Ligada percorrendo: " + (fim - inicio) / 1000.0);
		
		//Removendo itens do começo:
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			vetor.remove(0);
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Vetor removendo do começo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			lista.remove(0);
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Lista LIgada removendo do começo: " + (fim - inicio) / 1000.0);

	}

}

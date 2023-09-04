package br.com.caelum.ed.listasligadas;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Vivian");
		lista.adiciona("Gustavo");
		lista.adiciona("Maria");
		
		lista.remove(1);
		
		System.out.println(lista);

	}

}

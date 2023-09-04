package br.com.caelum.ed.listasligadas;

public class TestePegaPorPosicao {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Marcelo");
		lista.adiciona("Gabriel");
		
		System.out.println(lista.pega(0));
		System.out.println(lista.pega(1));

	}

}

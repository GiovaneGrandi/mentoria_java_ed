package br.com.caelum.ed.listasligadas;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Ana");
		lista.adiciona(0, "Giovane");
		lista.adiciona(2, "Lucas");
		
		System.out.println(lista);

	}

}

package br.com.caelum.ed.listasligadas;

public class TesteRemoveDoFim {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Douglas");
		lista.adiciona("Cauã");
		
		lista.removeDoFim();
		
		System.out.println(lista);

	}

}

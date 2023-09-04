package br.com.caelum.ed.listasligadas;

public class RemoveDoComeco {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Melissa");
		lista.adiciona("Ana");
		
		lista.removeDoComeco();
		
		System.out.println(lista);

	}

}

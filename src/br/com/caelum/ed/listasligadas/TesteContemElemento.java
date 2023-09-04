package br.com.caelum.ed.listasligadas;

public class TesteContemElemento {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Giovane");
		lista.adiciona("Guilherme");
		
		System.out.println(lista.contem("Giovane"));
		System.out.println(lista.contem("Ana"));

	}

}

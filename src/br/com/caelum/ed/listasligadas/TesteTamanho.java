package br.com.caelum.ed.listasligadas;

public class TesteTamanho {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Giovane");
		lista.adiciona("Eduardo");
		
		System.out.println(lista.tamanho());
		
		lista.adiciona("Frederico");
		
		System.out.println(lista.tamanho());

	}

}

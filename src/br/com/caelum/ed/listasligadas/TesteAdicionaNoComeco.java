package br.com.caelum.ed.listasligadas;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Giovane");
		lista.adicionaNoComeco("Lucas");
		
		System.out.println(lista);

	}

}

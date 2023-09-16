package br.com.caelum.conjuntos;

import java.util.List;

public class TesteRemove {

	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("Giovane");
		conjunto.adiciona("Ayrton");
		conjunto.adiciona("Marcelo");
		
		List<Object> objetos = conjunto.pegaTodos();
		
		System.out.println("Antes de remover:");
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
		
		conjunto.remove("Giovane");
		
		objetos = conjunto.pegaTodos();
		
		System.out.println("Depois de remover:");
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}

	}

}

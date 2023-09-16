package br.com.caelum.conjuntos;

import java.util.List;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("Giovane");
		conjunto.adiciona("Richard");
		conjunto.adiciona("Ana");
		
		List<Object> objetos = conjunto.pegaTodos();
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
		
	}

}

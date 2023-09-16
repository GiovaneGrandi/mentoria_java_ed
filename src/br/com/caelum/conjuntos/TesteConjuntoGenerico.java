package br.com.caelum.conjuntos;

public class TesteConjuntoGenerico {

	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("Giovane");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Eduardo");
		conjunto.adiciona("Guilherme");
		
		System.out.println(conjunto.pegaTodos());

	}

}

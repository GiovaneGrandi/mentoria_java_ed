package br.com.caelum.conjuntos;

public class TesteDesempenho {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for (int i = 0; i < 50000; i++) {
			conjunto.adiciona("palavra" + i);
		}
		
		for (int i = 0; i < 50000; i++) {
			conjunto.contem("palavra" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		
		//Sem a tabela dinâmica: Tempo: 1.609
		//Com a tabela dinâmica: Tempo: 0.089

	}

}

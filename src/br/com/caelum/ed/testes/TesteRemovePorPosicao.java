package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Richard");
		a2.setNome("Marcelo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a2);
		lista.adiciona(a1);
		
		System.out.println(lista);
		
		lista.remove(0);
		
		System.out.println(lista);
		
	}

}

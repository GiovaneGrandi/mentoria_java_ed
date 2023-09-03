package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TestePega {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Giovane");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(aluno);
		
		lista.pega(0);
		
		lista.pega(1);
		
		lista.pega(1000000);

	}

}

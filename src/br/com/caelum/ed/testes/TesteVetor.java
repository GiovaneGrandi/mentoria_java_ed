package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorGeneric;

public class TesteVetor {

	public static void main(String[] args) {
		
		VetorGeneric lista = new VetorGeneric();
		
		System.out.println(lista.tamanho());
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			lista.adiciona(aluno);
		}
		
		System.out.println(lista.tamanho());
		
	}

}

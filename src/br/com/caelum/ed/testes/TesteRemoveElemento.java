package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorGeneric;

public class TesteRemoveElemento {

	public static void main(String[] args) {
		
		VetorGeneric lista = new VetorGeneric();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Giovane");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Ana");
		
		Aluno aluno3 = new Aluno();
		
		aluno3.setNome("Melissa");
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno1);
		lista.adiciona(aluno3);
		
		System.out.println(lista);
		
		lista.remove(aluno1);
		
		System.out.println(lista);

	}

}

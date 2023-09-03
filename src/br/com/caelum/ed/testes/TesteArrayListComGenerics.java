package br.com.caelum.ed.testes;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

public class TesteArrayListComGenerics {

	public static void main(String[] args) {
		
		ArrayList vetorSemGenerics = new ArrayList();
		ArrayList<Aluno> VetorComGenerics = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Giovane");
		
		vetorSemGenerics.add(aluno);
		VetorComGenerics.add(aluno);
		
		Aluno a1 = (Aluno) vetorSemGenerics.get(0);
		Aluno a2 = VetorComGenerics.get(0);
		
		System.out.println(a1);
		System.out.println(a2);
		
		//VetorComGenerics.add("Ana");

	}

}

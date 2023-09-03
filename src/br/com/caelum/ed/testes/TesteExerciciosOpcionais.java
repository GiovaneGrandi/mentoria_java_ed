package br.com.caelum.ed.testes;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteExerciciosOpcionais {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add(";");
		lista.add("Banana");
		lista.add("15");
		
		System.out.println(lista);
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Giovane");
		
		//lista.add(aluno);
		
		lista.remove(0);
		
		//System.out.println(lista);

	}

}

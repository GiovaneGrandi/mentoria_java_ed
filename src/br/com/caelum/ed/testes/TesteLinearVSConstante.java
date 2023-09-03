package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLinearVSConstante {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 100000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = " + tempo);
		
		//Linear: Tempo em segundos = 1.116
		//Constante: Tempo em segundos = 0.005

	}

}

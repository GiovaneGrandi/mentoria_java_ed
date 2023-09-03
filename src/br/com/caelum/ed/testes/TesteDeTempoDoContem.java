package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteDeTempoDoContem {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			if(lista.contem(aluno)) {
				System.out.println("Erro! aluno " + aluno + " foi adicionado");
			}
		}
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo = " + tempo);
		
		//Linear: Tempo = 0.665
		//Constante: Tempo = 0.003
		
	}

}

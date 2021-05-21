package com.loiane.cursojavaintermediario.aula55;

import com.loiane.cursojavaintermediario.aula54.DiaSemana;

//O método values retorna um array com todos os valores de um Enum

public class TesteEnumAula55 {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}

		System.out.println();

		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);

		}
	}
}

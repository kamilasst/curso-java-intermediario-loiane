package com.loiane.cursojavaintermediario.aula55;

import com.loiane.cursojavaintermediario.aula53.DiaSemanaEnum;

//O método valueOf recebe uma String e retorna um enum.

public class TesteEnum2Aula55 {

	public static void main(String[] args) {

		System.out.println(Enum.valueOf(DiaSemanaEnum.class, "DOMINGO"));

		DiaSemanaEnum dia = Enum.valueOf(DiaSemanaEnum.class, "DOMINGO");

		System.out.println(dia);

		String domingo = "DOMINGO";
		DiaSemanaEnum valorEnum = null;
		try {
			valorEnum = DiaSemanaEnum.valueOf(domingo);
			System.out.println(valorEnum);
		} catch (Exception e) {
			System.out.println("Não existe esse valor");
		}

	}
}

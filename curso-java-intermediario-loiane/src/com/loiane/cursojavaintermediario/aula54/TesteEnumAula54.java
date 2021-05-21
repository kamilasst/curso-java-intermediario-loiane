package com.loiane.cursojavaintermediario.aula54;

public class TesteEnumAula54 {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SEGUNDA;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(15, 9, 2020, DiaSemana.TERCA);
	}

}

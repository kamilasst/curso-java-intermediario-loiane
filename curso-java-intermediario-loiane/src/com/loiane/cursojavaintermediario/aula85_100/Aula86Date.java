package com.loiane.cursojavaintermediario.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(hoje);
		System.out.println("Milisegundos desde 1 jan 1970 " + hoje.getTime());

		System.out.println(hoje.getDate());// Dia do mês - Está depreciado, significa que existe uma forma mais nova de
											// obter essa informação

	}
}

package com.loiane.cursojavaintermediario.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {

		// Exemplo Adler

		int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
		System.out.println(firstDayOfWeek);

		int minimalDaysInFirstWeek = Calendar.getInstance().getMinimalDaysInFirstWeek();
		System.out.println(minimalDaysInFirstWeek); // retorna o objeto já criado

		/*
		 * Não precisamos instanciar, pq o metodo já retorna uma instancia de
		 * Calendar(filho de calendar: new GregorianCalendar). Essa forma utilizada é um
		 * padrão de projeto, chamado singleton
		 */
//		Calendar hoje = Calendar.getInstance();
//
//		int ano = hoje.get(Calendar.YEAR);
//		int mes = hoje.get(Calendar.MONTH);
//		int dia = hoje.get(Calendar.DAY_OF_MONTH);
//		int hora = hoje.get(Calendar.HOUR_OF_DAY);
//		int minutos = hoje.get(Calendar.MINUTE);
//		int segundos = hoje.get(Calendar.SECOND);
//
//		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);
//
//		hoje.add(Calendar.DAY_OF_MONTH, 5);
//		hoje.add(Calendar.DAY_OF_MONTH, -2);
//
//		System.out.println();
//
//		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
//		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}
}

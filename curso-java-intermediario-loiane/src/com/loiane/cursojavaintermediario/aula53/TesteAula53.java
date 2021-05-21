package com.loiane.cursojavaintermediario.aula53;

public class TesteAula53 {

	public static void main(String[] args) {

		usandoConstantes();

		System.out.println();

		usandoEnum();
	}

	private static void usandoConstantes() {

		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;

		System.out.println("Teste utilizando constantes no Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);

	}

	private static void imprimeDiaSemana(int dia) {

		switch (dia) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Ter�a-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}

	private static void usandoEnum() {

		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

		System.out.println("Teste utilizando Enum no Java");

		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}

	private static void imprimeDiaSemana(DiaSemanaEnum dia) {

		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
		case TERCA:
			System.out.println("Ter�a-Feira");
			break;
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
		case SABADO:
			System.out.println("S�bado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}

}

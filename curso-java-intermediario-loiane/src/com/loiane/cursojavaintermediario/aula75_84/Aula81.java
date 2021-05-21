package com.loiane.cursojavaintermediario.aula75_84;

public class Aula81 {

	public static void main(String[] args) {

		// toLowerCase - para caixa baixa (minusculo)
		// toUpperCase - para caixa alta (maiusculo)

		String teste = "Teste";
		String testeMinusculo = teste.toLowerCase();
		String testeMaiusculo = teste.toUpperCase();

		System.out.println(teste.toLowerCase());
		System.out.println(testeMinusculo);
		System.out.println(teste.toUpperCase());
		System.out.println(testeMaiusculo);

		// Outra forma de fazer comparação entre Strings
		// if (teste.toLowerCase().equals(teste.toLowerCase()));
	}

}

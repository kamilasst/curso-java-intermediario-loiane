package com.loiane.cursojavaintermediario.aula75_84;

public class Aula79 {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";

		/*
		 * indexOf = significa �ndice de. E retorna o �ndice desse caracter ou in�cio da
		 * String que se encontra. Ele retorna -1 caso n�o tenha encontrado
		 */
		System.out.println(banana.indexOf('x'));// -1
		System.out.println(banana.indexOf('b'));// 0
		System.out.println(banana.indexOf('a'));// 1 indica a posi��o da Primeira vez que a letra 'a' aparece

		System.out.println(banana.indexOf(ana));// 1 inicio da String

		/*
		 * lastIndexOf procura a �ltima vez que o caractere aparece na String e indica
		 * sua posi��o
		 */

		System.out.println(banana.lastIndexOf('a'));// 5
		System.out.println(banana.lastIndexOf(ana));// 3

		// contains - verifica se contem

		System.out.println(banana.contains(ana));// true
		System.out.println(banana.contains("ceu"));// false
	}

}

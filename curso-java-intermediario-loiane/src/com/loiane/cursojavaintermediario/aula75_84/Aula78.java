package com.loiane.cursojavaintermediario.aula75_84;

public class Aula78 {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);

		// equals - Compara Strings se importa com letra maiúscula e minúscula
		System.out.println("ola equals ola2 = " + ola.equals(ola2));// false
		System.out.println("ola equals ola3 = " + ola.equals(ola3));// true

		// equalsIngoreCase - Compara String e não importa se a letra é maiúscula ou
		// minúscula
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2));// true

		System.out.println("ola equals ola2 = " + (ola == ola2));// false
		System.out.println("ola equals ola3 = " + (ola == ola3));// true - Ele compara a referência de mémoria. Elas
																	// apontam para mesma referência, pq fazem
																	// atribuição simples.

		System.out.println("ola equals ola4 = " + (ola == ola4));// false - Porque compara a referência
		System.out.println("ola equals ola4 = " + ola.equals(ola4));// true - Porque compara o conteúdo, o conteúdo é o
																	// mesmo
		System.out.println("ola equals ola4 = " + ola.equalsIgnoreCase(ola4));// true - Porque compara o conteúdo, o
																				// conteúdo é o mesmo
		/*
		 * A forma mais segura de comparar String é atrvés de equals - quando quer
		 * diferenciar maiúscula e minúscula e equalsIgnoreCase - quando não quer
		 * diferenciar maiúscula e minúscula
		 */

		// Método para comparar determinada região daquela String com outras String
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

		// Comparar String se ela tem inicio ou fim com determinada outra String
		// endsWith - terminar com
		// startsWith - começa com
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));

		String a = "a";
		String b = "b";
		String aMaiusculo = "A";

		/*
		 * compareTo - Usado para comparar objetos.
		 * Suas saídas são: 
		 * -1 quando a > b;
		 * 0 quando a == b;
		 * 1 ou >1 quando a < b;
		 */

		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));
	}

}

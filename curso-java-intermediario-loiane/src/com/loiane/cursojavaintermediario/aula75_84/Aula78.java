package com.loiane.cursojavaintermediario.aula75_84;

public class Aula78 {

	public static void main(String[] args) {

		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";
		String ola4 = new String(ola);

		// equals - Compara Strings se importa com letra mai�scula e min�scula
		System.out.println("ola equals ola2 = " + ola.equals(ola2));// false
		System.out.println("ola equals ola3 = " + ola.equals(ola3));// true

		// equalsIngoreCase - Compara String e n�o importa se a letra � mai�scula ou
		// min�scula
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2));// true

		System.out.println("ola equals ola2 = " + (ola == ola2));// false
		System.out.println("ola equals ola3 = " + (ola == ola3));// true - Ele compara a refer�ncia de m�moria. Elas
																	// apontam para mesma refer�ncia, pq fazem
																	// atribui��o simples.

		System.out.println("ola equals ola4 = " + (ola == ola4));// false - Porque compara a refer�ncia
		System.out.println("ola equals ola4 = " + ola.equals(ola4));// true - Porque compara o conte�do, o conte�do � o
																	// mesmo
		System.out.println("ola equals ola4 = " + ola.equalsIgnoreCase(ola4));// true - Porque compara o conte�do, o
																				// conte�do � o mesmo
		/*
		 * A forma mais segura de comparar String � atrv�s de equals - quando quer
		 * diferenciar mai�scula e min�scula e equalsIgnoreCase - quando n�o quer
		 * diferenciar mai�scula e min�scula
		 */

		// M�todo para comparar determinada regi�o daquela String com outras String
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

		// Comparar String se ela tem inicio ou fim com determinada outra String
		// endsWith - terminar com
		// startsWith - come�a com
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));

		String a = "a";
		String b = "b";
		String aMaiusculo = "A";

		/*
		 * compareTo - Usado para comparar objetos.
		 * Suas sa�das s�o: 
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

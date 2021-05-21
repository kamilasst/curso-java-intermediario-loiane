package com.loiane.cursojavaintermediario.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {

		String java = "Java";

		// O método charAt permite acessar cada caracter que esta dentro dessa String

		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}

		/*
		 * O método getChars vai extrair caracteres dessa String e atribuir os mesmos a
		 * um array de chars. Ordem dos parâmetros do método (srcBegin-posição do
		 * caracter que quero copiar, srcEnd -posição final do caracter que quero, dst
		 * -qual é o destino, dstBegin - primeiro indice do caracter que quero copiar)
		 * 
		 */

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);

		// seria o mesmo que:
		for (int i = 0, j = 0; i < 3; i++, j++) {
			jav[j] = java.charAt(i);
		}
		System.out.println(jav);

		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0);
		System.out.println(Arrays.toString(javBytes));

		// Método transformar uma string em uma array de chars

		char[] javChars = java.toCharArray();
		System.out.println(javChars);

		/*
		 * Entre os métodos apresentados nessa aula, o charAt é o mais útil no dia a
		 * dia. Os outros são apenas informações (é legal saber que existem
		 */
	}
}

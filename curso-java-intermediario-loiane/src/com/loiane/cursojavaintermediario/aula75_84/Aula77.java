package com.loiane.cursojavaintermediario.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {

		String java = "Java";

		// O m�todo charAt permite acessar cada caracter que esta dentro dessa String

		for (int i = 0; i < java.length(); i++) {
			System.out.println(java.charAt(i));
		}

		/*
		 * O m�todo getChars vai extrair caracteres dessa String e atribuir os mesmos a
		 * um array de chars. Ordem dos par�metros do m�todo (srcBegin-posi��o do
		 * caracter que quero copiar, srcEnd -posi��o final do caracter que quero, dst
		 * -qual � o destino, dstBegin - primeiro indice do caracter que quero copiar)
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

		// M�todo transformar uma string em uma array de chars

		char[] javChars = java.toCharArray();
		System.out.println(javChars);

		/*
		 * Entre os m�todos apresentados nessa aula, o charAt � o mais �til no dia a
		 * dia. Os outros s�o apenas informa��es (� legal saber que existem
		 */
	}
}

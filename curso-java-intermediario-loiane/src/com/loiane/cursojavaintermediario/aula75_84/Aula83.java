package com.loiane.cursojavaintermediario.aula75_84;

public class Aula83 {

	public static void main(String[] args) {

		// Concatena��o com StringBuffet
		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;
		}

		System.out.println(alfabeto);

		StringBuffer sb = new StringBuffer(); // Esse � thread safe
		for (String letra : letras) {
			sb.append(letra);// append - m�todo que vai acrescentando
		}
		alfabeto = sb.toString();

		System.out.println(alfabeto);

		// outra forma
		alfabeto = new String(sb);
		System.out.println(alfabeto);

		// Reverso da String
		System.out.println(sb.reverse());

		StringBuilder sb_ = new StringBuilder();// N�o � thread safe
		for (String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();

		System.out.println(alfabeto);
	}

}

package com.loiane.cursojavaintermediario.aula75_84;

public class Aula75 {

	public static void main(String[] args) {

		String vazia = new String(); // "" - como se tivesse fazendo uma atribuição a uma string vazia
		System.out.println(vazia);

		String java = new String("JAVA");// Passando uma string para o construtor
		System.out.println(java);

		String java1 = new String(java); // Passando uma outra string - Referenciando uma outra variável
		System.out.println(java1);

		char[] charsJava = { 'J', 'A', 'V', 'A' };
		String java2 = new String(charsJava); // O construtor do String tbm aceita um array de caracter
		System.out.println(java2);

		char[] abcdef = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String abc = new String(abcdef, 0, 3); // Indices de inicio e fim do array
		System.out.println(abc); // aparece apenas ABC

		byte[] ascii = { 65, 66, 67, 68, 69 };
		String abcde = new String(ascii);
		System.out.println(abcde);

		String bcd = new String(ascii, 1, 3);// offset,length
		System.out.println(bcd);

		String java3 = "JAVA"; // Atribuição simples
		String java4 = "JAVA";
		System.out.println(java3);
		System.out.println(java4);
	}
}

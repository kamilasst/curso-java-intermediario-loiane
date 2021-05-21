package com.loiane.cursojavaintermediario.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		// subString - consegue extrair pedaços de uma String
		String teste = "Isso é um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10));// teste (índice de ínicio)
		System.out.println(teste.substring(10, 15));// (índice de ínicio e fim)

		String ola = "Olá";
		String mundo = " Mundo";
		String olaMundo = ola.concat(mundo);// Concatenando. Mesma coisa de fazer ola + mundo
		System.out.println(olaMundo);

		// replace - substitui o carater
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);

		// replace - substitui tudo
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());// remove todos os espaços que tiverem sobrando antes e depois
	}

}

package com.loiane.cursojavaintermediario.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		// subString - consegue extrair peda�os de uma String
		String teste = "Isso � um teste.";
		System.out.println(teste);
		System.out.println(teste.substring(10));// teste (�ndice de �nicio)
		System.out.println(teste.substring(10, 15));// (�ndice de �nicio e fim)

		String ola = "Ol�";
		String mundo = " Mundo";
		String olaMundo = ola.concat(mundo);// Concatenando. Mesma coisa de fazer ola + mundo
		System.out.println(olaMundo);

		// replace - substitui o carater
		String espacos = "i s p a � o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);

		// replace - substitui tudo
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);

		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim());// remove todos os espa�os que tiverem sobrando antes e depois
	}

}

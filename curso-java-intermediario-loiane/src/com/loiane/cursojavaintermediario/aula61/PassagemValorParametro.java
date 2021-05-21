package com.loiane.cursojavaintermediario.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato1", "3822-2712", "contato1@hotmail.com");
		int valor = 10;

		System.out.println("******Valores Originais");
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("******Exemplo 1");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato);
		System.out.println(valor);

		System.out.println("******Exemplo 2");
		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}

	public static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato2", "3822-4567", "contato2@hotmail.com");

	}

	public static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + novoValor);
	}

	public static String getNome(int valor) {

		int novoValor = valor + 10;
		valor = novoValor;

		return "Contato" + novoValor;
	}
}

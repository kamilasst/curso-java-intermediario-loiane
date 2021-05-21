package com.loiane.cursojavaintermediario.aula66;

import com.loiane.cursojavaintermediario.aula61.Contato;

public class ColetorLixo {

	public static void obterMemoriaUsada() {

		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime();

		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[10000];
		Contato contato;

		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "3822-1456" + i, "Contato" + i + "@email.com");
			contatos[i] = contato;
		}
		System.out.println("Contatos Criados");

		obterMemoriaUsada();

		contatos = null;

		Runtime.getRuntime().runFinalization(); // Esse m�todo pede para executar a finaliza��o desses objetos

		Runtime.getRuntime().gc(); // Chamando o Garbage colector - for�ando a execu��o do GC (N�o e garantido a
									// sua execu��o)

		System.out.println("Contatos removidos da m�moria");

		obterMemoriaUsada();
	}

}

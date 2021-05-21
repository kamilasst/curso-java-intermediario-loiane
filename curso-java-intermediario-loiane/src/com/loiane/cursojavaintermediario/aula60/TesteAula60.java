package com.loiane.cursojavaintermediario.aula60;

public class TesteAula60 {

	public static void main(String[] args) {

		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);

		System.out.println(escopo.getValor()); // 10
		System.out.println(escopo.calculaValor(20)); // 30
		System.out.println(escopo.getValor()); // 10
		System.out.println(escopo.teste()); // 4
		System.out.println(escopo.getValor()); // 4
	}

	public void outroTeste() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// i++; //erro de compila��o

		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}

		System.out.println(j); // j tem valor de 10
	}

	public void maisUmTeste() {

		boolean flag = true;

		if (flag) {

			int umaVariavel = 10;
			umaVariavel++;

			System.out.println(umaVariavel);
		}
		// System.out.println(umaVariavel)); // erro de compila��o
	}

	public void maisUmOutroTeste(int num) {

		int total = 0;

		try {
			int outroNum = 0;

			total = num / outroNum;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			total++;
			// outroNum++; //erro de compila��o
			// e.printStackTrace(); //erro de compila��o
		}

		num++;

		// outroNum++; //erro de compila��o
		// e.printStackTrace(); //erro de compila��o

	}
}

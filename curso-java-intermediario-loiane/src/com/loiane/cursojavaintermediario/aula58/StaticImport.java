package com.loiane.cursojavaintermediario.aula58;

/*Quando for utilizar muito uma classe, por exemplo, Math, pra não está 
 * chamando várias vezes ela no código, posso importar os métodos que 
 * vou utilizar -- Fica mais elegante utilizar assim, pq fica mais explicito*/
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*Uma outra maneira é, se for importar muitos métodos, posso importar todos os
 * métodos daquela classe Math*/
//import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;

		/*
		 * Esses métodos são estáticos pq não precisamos instanciar a classe Math para
		 * utilizar os métodos
		 */
		System.out.println(Math.pow(a, b)); // Potência
		System.out.println(Math.sqrt(c)); // Raiz quadrada

		// Quando importo o método, utilizo assim:
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));

	}

}

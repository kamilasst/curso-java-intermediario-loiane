package com.loiane.cursojavaintermediario.aula58;

/*Quando for utilizar muito uma classe, por exemplo, Math, pra n�o est� 
 * chamando v�rias vezes ela no c�digo, posso importar os m�todos que 
 * vou utilizar -- Fica mais elegante utilizar assim, pq fica mais explicito*/
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*Uma outra maneira �, se for importar muitos m�todos, posso importar todos os
 * m�todos daquela classe Math*/
//import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;

		/*
		 * Esses m�todos s�o est�ticos pq n�o precisamos instanciar a classe Math para
		 * utilizar os m�todos
		 */
		System.out.println(Math.pow(a, b)); // Pot�ncia
		System.out.println(Math.sqrt(c)); // Raiz quadrada

		// Quando importo o m�todo, utilizo assim:
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));

	}

}

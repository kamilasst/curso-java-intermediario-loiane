package com.loiane.cursojavaintermediario.aula54;

/*Se for algo mais especifico pra uma determinada classe ou caso não vá fazer o
 * reuso desse enum em outras classes podemos declarar o enumerador dentro de uma
 * classe e fazer o uso naquela classe onde ela foi declarada.
*/
public class Formulario {

	enum Genero {

		FEMININO('F'), MASCULINO('M');

		private char valor;

		Genero(char valor) {
			this.valor = valor;
		}
	}

	private String nome;
	private Genero genero;
}

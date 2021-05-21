package com.loiane.cursojavaintermediario.aula54;

//Dependendo do projeto podemos declarar o enumerador como se fosse uma classe separada
public enum DiaSemana {

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

	private int valor;

	DiaSemana(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

}

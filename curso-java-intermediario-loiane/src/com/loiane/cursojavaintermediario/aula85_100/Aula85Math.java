package com.loiane.cursojavaintermediario.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3));// Potência

		System.out.println(Math.round(4.7));// arredondamento pra cima quando maior que 4.5 = 5
		System.out.println(Math.round(4.4));// arredondamento pra baixo quando menor que 4.5 = 4

		System.out.println(Math.ceil(4.7));// arredondamento pra cima = 5
		System.out.println(Math.ceil(4.4));// arredondamento pra cima = 5

		System.out.println(Math.floor(4.7));// arredondamento pra baixo = 4
		System.out.println(Math.floor(4.4));// arredondamento pra baixo = 4

		System.out.println(Math.round(Math.random() * 100));// arredondamento números sorteados aletoriamente

		System.out.println(Math.sin(Math.toRadians(30)));// calculando o seno
		System.out.println(Math.cos(Math.toRadians(1)));// calculando o cosseno
		System.out.println(Math.tan(Math.toRadians(45)));// arredondamento pra cima = 5

	}
}

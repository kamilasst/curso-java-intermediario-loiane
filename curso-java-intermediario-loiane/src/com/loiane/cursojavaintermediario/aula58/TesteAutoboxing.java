package com.loiane.cursojavaintermediario.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {

		// Autoboxing - Transforma os valores primitos em um objeto
		/*
		 * Ao inves de chamar o construtor da classe(criando objetos),
		 * pode,automaticamente, atribuir o valor diretamente
		 */
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l; // new Long(10000l);
		Float num11 = 3.5f; // new Float(3.5f);
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character d = 'd';

		// Auto unboxing - transformando um tipo que é de uma classe em um tipo
		// primitivo novamente
		int num13 = num9; // num9.intValue();

		// Autoboxing em expressões
		num9++;
		System.out.println(num9);

		// 1º Auto unboxing do num9 - fica primitivo
		// 2º Autoboxing do resultado do valor dessa expressão para o num14.
		Integer num14 = num13 / num9;

		/*
		 * mau uso de auto boxing e unboxing - Dica para não acontecer isso, é trabalhar
		 * diretamente com os números primitivos e no final se for preciso fazer o
		 * autoboxing, pra um numero do tipo objeto na classe wrapper
		 */
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;

		Double media = (a + b + c) / 3;
		System.out.println(media);

	}

}

package com.loiane.cursojavaintermediario.aula57;

public class TesteWrapperss {

	public static void main(String[] args) {

		boolean flag = true;
		char a = 'a';
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.55555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');

		// Outra opção de construtor é passar como string

		Integer num13 = new Integer("10000");
		Double num14 = new Double("3.5");

		System.out.println(num13.intValue());

		// Conveersão para outro tipo
		Long num15 = num13.longValue();

		// Consigo transformar o valor de uma String em um valor numérico
		int num16 = Integer.parseInt("100000");
		double num17 = Double.parseDouble("3.5555");
		System.out.println(num17);

		// valueOf vai transformar um tipo primitivo em uma instancia de um objeto
		// boxing e unboxing é uma forma mais fácil de fazer essa conversão.(Próxima
		// aula)
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);

	}

}
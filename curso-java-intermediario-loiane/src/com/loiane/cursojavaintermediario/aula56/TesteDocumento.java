package com.loiane.cursojavaintermediario.aula56;

public class TesteDocumento {

	public static void main(String[] args) {

		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}

		Pessoa pessoaFisica = new Pessoa();
		pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaFisica);

		Pessoa pessoaJuridica = new Pessoa();
		pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaJuridica);

		// Forma mais usual e fácil

		Pessoa pessoaFisicaAdler = new Pessoa();
		TipoDocumento documentoAdler = TipoDocumento.CPF;
		pessoaFisicaAdler.setTipoDocumento(documentoAdler);
		// pessoaFisicaAdler.setNumeroDocumento("111.111.111-11");
		pessoaFisicaAdler.setNumeroDocumento(documentoAdler.geraNumeroTeste());

	}
}

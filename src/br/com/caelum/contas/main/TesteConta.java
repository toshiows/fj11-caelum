package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

class TesteConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("Marcos");
		c1.setTitular("Lucas");
		c1.setNumero(12542);
		c1.setAgencia("121-01");
		c1.depositar(1500.00);
		// c1.titular = "Lopes";

		// Data dt = new Data();

	/*	c1.setDataAbertura(new Data());
		c1.getDataAbertura().dia = 05;
		c1.getDataAbertura().mes = 05;
		c1.getDataAbertura().ano = 2010;*/

		c1.sacar(200.00);
		c1.depositar(50.00);

		System.out.println(c1.recuperaDadosParaImpressao());

		System.out.println();
		Conta c2 = new Conta();

		System.out.println();
		Conta c3 = new Conta("Jose", 145874, 300.00);
	/*	c3.setDataAbertura(new Data());
		c3.getDataAbertura().dia = 21;
		c3.getDataAbertura().mes = 01;
		c3.getDataAbertura().ano = 1998;*/

		System.out.println(c3.recuperaDadosParaImpressao());
	}
}
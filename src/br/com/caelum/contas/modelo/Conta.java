package br.com.caelum.contas.modelo;

/**
 * Classe responsavel por moldar as contas do banco
 * 
 * @author Toshio
 *
 */

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	//private Data dataAbertura;

	public Conta() {
		System.out.println("Criando conta sem receber valor");
	}

	public Conta(String titular) {
		this.titular = titular;
	}
	
	public String getTipo() {
		return "Conta";
	}

	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

/*	public Data getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}*/

	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		return "Titular: " + titular
			+ "\nNumero: " + numero
			+ "\nAgencia: " + agencia
			+ "\nSaldo: " + String.format("%.2f", saldo)
		//	+ "\nData de Abertura: " + dataAbertura.dia + "/" 
			//+ dataAbertura.mes + "/" + dataAbertura.ano
			+ "\nRendimentos: " + String.format("%.2f", calculaRendimento());
	}

}
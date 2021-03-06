package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.exceptions.SaldoInsuficienteException;

/**
 * Classe responsavel por moldar as contas do banco
 * 
 * @author Toshio
 *
 */

public abstract class Conta implements Comparable<Conta>{
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	//private Data dataAbertura;

	public Conta() {
		//System.out.println("Criando conta sem receber valor");
	}

	public Conta(String titular) {
		this.titular = titular;
	}
	
	public abstract String getTipo();

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

	public void sacar(double valor) throws SaldoInsuficienteException{
		if(valor < 0) {
			throw new IllegalArgumentException("Voce tentou sacar um valor negativo");
		}
		
		if(valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		
		this.saldo = saldo - valor;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		}
		
		this.saldo += valor;
	}
	
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero
				+ ", agencia=" + agencia + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj; //fez o cast de outra conta para pegar o conta do obj
										//igualou o endereco de memoria para comparar o objeto atual (recebido)
										//com outra variavel com mesmo endereço de memoria
										//COMPAROU OS MESMOS OBJETOS
		
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}


	
	
	/*public String recuperaDadosParaImpressao() {
		return "Titular: " + titular
			+ "\nNumero: " + numero
			+ "\nAgencia: " + agencia
			+ "\nSaldo: " + String.format("%.2f", saldo)
		//	+ "\nData de Abertura: " + dataAbertura.dia + "/" 
			//+ dataAbertura.mes + "/" + dataAbertura.ano
			+ "\nRendimentos: " + String.format("%.2f", calculaRendimento());
	}*/

}
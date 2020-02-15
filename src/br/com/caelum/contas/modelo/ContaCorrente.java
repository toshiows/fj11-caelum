package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{

	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		super.sacar(valor + 0.10);
		//this.saldo -= valor + 0.10;
	}
	
	@Override
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		super.sacar(valor);
		conta.depositar(valor);
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}

	/*@Override
	public int compareTo(ContaCorrente outra) {
		if(this.saldo < outra.saldo) {
			return -1;
		}
		if(this.saldo > outra.saldo) {
			return 1;
		}
		return 0;
	}*/
}

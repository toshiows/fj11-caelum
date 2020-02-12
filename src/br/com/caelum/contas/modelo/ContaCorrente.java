package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{

	public String getTipo() {
		return super.getTipo() + " Corrente";
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor + 0.10);
		//this.saldo -= valor + 0.10;
	}
	
	@Override
	public void transfere(double valor, Conta conta) {
		super.sacar(valor);
		conta.depositar(valor);
	}
}

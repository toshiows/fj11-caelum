package br.com.caelum.contas.modelo.exceptions;

public class SaldoInsuficienteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}

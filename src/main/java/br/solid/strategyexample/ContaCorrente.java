package br.solid.strategyexample;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente, TipoConta.CORRENTE);
	}

}

package br.solid.strategy;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente, TipoConta.CORRENTE);
	}

}

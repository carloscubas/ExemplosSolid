package br.solid.strategy;

public class ContaEstudante extends Conta {

	public ContaEstudante(Cliente cliente) {
		super(cliente, TipoConta.ESTUDANTE);
	}

}

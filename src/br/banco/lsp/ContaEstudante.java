package br.banco.lsp;

public class ContaEstudante extends Conta {

	public ContaEstudante(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void rende(){
		throw new RuntimeException("Conta Estudante não rende");
	}

}

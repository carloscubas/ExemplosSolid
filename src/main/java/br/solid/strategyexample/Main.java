package br.solid.strategyexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();

		Cliente clienteContaCorrente = new Cliente();
		clienteContaCorrente.setNome("Maria");
		Conta contaCorrente = new ContaCorrente(clienteContaCorrente);
		contaCorrente.deposita(1000.00);

		Cliente clienteEstudante = new Cliente();
		clienteEstudante.setNome("João");
		Conta contaEstudante = new ContaEstudante(clienteEstudante);
		contaEstudante.deposita(1000.00);

		contas.add(contaCorrente);
		contas.add(contaEstudante);

		Relatorio relatorio = new Relatorio();
		relatorio.addConta(contaCorrente);
		relatorio.addConta(contaEstudante);

		relatorio.relatorio();
	}
}
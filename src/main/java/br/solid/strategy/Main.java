package br.solid.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();

		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		Conta contaCorrente = new ContaCorrente(cliente);
		contaCorrente.deposita(1000.00);

		Cliente estudante = new Estudante();
		estudante.setNome("João");
		Conta contaEstudante = new ContaEstudante(estudante);
		contaEstudante.deposita(1000.00);

		contas.add(contaCorrente);
		contas.add(contaEstudante);

		Relatorio relatorio = new Relatorio();
		relatorio.addContas(contas);

		relatorio.relatorio();
	}
}
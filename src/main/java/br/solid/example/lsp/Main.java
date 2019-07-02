package br.solid.example.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		Cliente cliente = new PessoaFisica();
		
		Conta contaCorrente = new ContaCorrente(cliente);
		contaCorrente.deposita(500);
		
		Conta contaEstudante = new ContaEstudante(cliente);
		contaEstudante.deposita(500);
		
		contas.add(contaCorrente);
		contas.add(contaEstudante);
		
		for (Conta conta : contas) {
			
			conta.rende();
			
			System.out.println(conta.getSaldo());
			
		}

	}

}

package br.solid.strategy;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {

	public List<Conta> contas = new ArrayList<>();

	public void addConta(Conta conta) {
		contas.add(conta);
	}

	public void relatorio() {
		for (Conta conta : contas) {
			System.out.println(conta.getCliente().getNome());
			System.out.println(conta.getSaldo());

			for (Tributo tributo : conta.getTipoConta().getTributos()) {
				System.out.println(tributo.calculo(conta.getSaldo()));
			}

			System.out.println("-----------");
		}
	}

}

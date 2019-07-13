package br.solid.strategyexample;

public class Rendimento implements Tributo {

	@Override
	public Double calculo(Double saldo) {
		return saldo * 1.1;
	}

}

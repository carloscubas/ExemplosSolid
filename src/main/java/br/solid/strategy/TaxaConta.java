package br.solid.strategy;

public class TaxaConta implements Tributo {

	@Override
	public Double calculo(Double saldo) {
		return saldo - 5.0;
	}

}

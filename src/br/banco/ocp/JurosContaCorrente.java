package br.banco.ocp;

public class JurosContaCorrente implements Juros {

	@Override
	public double calculaJuros(double valor) {
		return valor * 0.15;
	}

}

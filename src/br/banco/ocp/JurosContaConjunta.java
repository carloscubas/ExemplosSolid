package br.banco.ocp;

public class JurosContaConjunta implements Juros {

	@Override
	public double calculaJuros(double valor) {
		return valor * 0.10;
	}

}

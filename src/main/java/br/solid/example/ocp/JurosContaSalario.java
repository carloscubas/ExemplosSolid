package br.solid.example.ocp;

public class JurosContaSalario implements Juros {

	@Override
	public double calculaJuros(double valor) {
		return valor * 0.05;
	}

}

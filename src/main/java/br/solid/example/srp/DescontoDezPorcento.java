package br.solid.example.srp;

public class DescontoDezPorcento implements RegraDesconto {

	@Override
	public double desconto(double valor) {
		return valor - ( valor * 0.10 );
	}

}

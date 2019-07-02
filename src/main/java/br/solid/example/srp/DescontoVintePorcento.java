package br.solid.example.srp;

public class DescontoVintePorcento implements RegraDesconto {

	@Override
	public double desconto(double valor) {
		return valor - ( valor * 0.20 );
	}

}

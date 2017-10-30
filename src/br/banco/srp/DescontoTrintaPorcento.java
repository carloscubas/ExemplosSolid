package br.banco.srp;

public class DescontoTrintaPorcento implements RegraDesconto {

	@Override
	public double desconto(double valor) {
		return valor - ( valor * 0.30 );
	}

}

package br.solid.example.ocp;


public class CalculaTaxaJuros {
	
	private Juros juros;
	
	public CalculaTaxaJuros(Juros juros) {
		this.juros = juros;
	}

	public double calculaTaxaJuros(Conta conta) {
		
		return this.juros.calculaJuros(conta.getSaldo());
		
	}

}

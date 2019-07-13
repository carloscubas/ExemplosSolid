package br.solid.strategyexample;

import java.util.Arrays;
import java.util.List;

public enum TipoConta {

	CORRENTE(Arrays.asList(new TaxaConta(), new Rendimento())),

	ESTUDANTE(Arrays.asList(new TaxaConta()));

	List<Tributo> tributos;

	private TipoConta(List<Tributo> tributos) {
		this.tributos = tributos;
	}

	public List<Tributo> getTributos() {
		return tributos;
	}
}

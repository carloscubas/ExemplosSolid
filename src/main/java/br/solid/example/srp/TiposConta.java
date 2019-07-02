package br.solid.example.srp;



public enum TiposConta {
	
	ESTUDANTE(new DescontoCincoPorcento()), 
	CONJUNTA(new DescontoDezPorcento()), 
	CORRENTE(new DescontoVintePorcento()), 
	EMPRESARIAL(new DescontoTrintaPorcento());
	
	private RegraDesconto regraDesconto;

	private TiposConta(RegraDesconto regraDesconto) {
		this.regraDesconto = regraDesconto;
	}

	public RegraDesconto getRegraDesconto() {
		return regraDesconto;
	}
	
}

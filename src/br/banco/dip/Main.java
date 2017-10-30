package br.banco.dip;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaFisica clientePessoaFisica = new PessoaFisica();
		clientePessoaFisica.setNome("cubas");
		clientePessoaFisica.setRg("2031848381");
		clientePessoaFisica.setCpf("123456789");
		
		Conta contaPessoaFisica = new Conta(clientePessoaFisica);
		contaPessoaFisica.deposita(10000);
		
		PessoaJuridica clientePessoaJuridica = new PessoaJuridica();
		
		Conta contaPessoaJuridica = new Conta(clientePessoaJuridica);
		contaPessoaJuridica.deposita(20000);
		
		System.out.println("Saldo Conta Pessoa Fisica: " + contaPessoaFisica.getSaldo());
		
		System.out.println("Saldo Conta Pessoa Juridica: " + contaPessoaJuridica.getSaldo());
		
	}

}

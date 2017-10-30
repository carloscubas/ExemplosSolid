package br.banco.isp;



public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new PessoaFisica();

		Conta conta = new Conta(cliente);
		conta.deposita(100);
		
		Tarifa tarifaAplicacao = new TarifaAplicacao();
		
		Tarifa tarifaConta = new TarifaConta();
		
		System.out.println("Tarifa Aplicacao: " + conta.getSaldo(tarifaAplicacao));
		
		System.out.println("Tarifa Conta: " + conta.getSaldo(tarifaConta));

	}

}

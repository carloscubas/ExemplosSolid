package br.solid.strategyexample;

public class Conta {

	private double saldo;
	private Cliente cliente;
	private TipoConta tipoConta;

	public Conta(Cliente cliente, TipoConta tipoConta) {
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}

	public boolean saca(double valorDoSaque) {
		if (this.saldo < valorDoSaque) {
			return false;
		} else {
			saldo = saldo - valorDoSaque;
			return true;
		}
	}

	public void deposita(double valorDepositado) {
		saldo = saldo + valorDepositado;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

}

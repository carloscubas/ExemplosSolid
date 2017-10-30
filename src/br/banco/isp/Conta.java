package br.banco.isp;

public class Conta  {

	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		
		this.cliente = cliente;
		
	}

	/** FAZ SAQUE **/
	public boolean saca(double valorDoSaque) {
		
		if (getSaldo() < valorDoSaque) {
			return false;
		} else {
			saldo = saldo - valorDoSaque;
			return true;
		}
		
	}

	/** FAZ DEPOSITO **/
	public void deposita(double valorDepositado) {
		
		saldo = saldo + valorDepositado;
		
	}

	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	public double getSaldo(Tarifa tarifa) {
		
		return this.saldo * tarifa.calculaTarifa();
		
	}

	public Cliente getCliente() {
		return cliente;
	}

}
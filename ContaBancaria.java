package atividade0910;

public class ContaBancaria {

	private double saldo;
	public ContaBancaria(double saldoInicial) {

		if (saldoInicial >=0) {
			this.saldo = saldoInicial;
		} 
		else {
			this.saldo = 0;
		}  
	}
	public double getsaldo() {
		return saldo;
	}

	public void depositar (double valor) {
		if (valor > 0);
		saldo += valor;} 
	 {
		System.out.println("valor do deposito invalido");
	}

	public void sacar (double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("saque invalido!");
		}
	}
}

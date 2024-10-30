package atividade0910;

public class ObjContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria (100000.00);

		System.out.println(conta.getsaldo());
		conta.depositar(500);
		conta.depositar(1000);
		System.out.println(conta.getsaldo());
		conta.sacar(1500);
		System.out.println(conta.getsaldo());
	}


}

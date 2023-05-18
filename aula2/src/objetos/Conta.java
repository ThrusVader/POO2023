package objetos;

public class Conta {
	int numero;
	String titular;
	double saldo;

	// Comportamentos
	// void = não tem retorno.
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito efetuado com sucesso!");
	}
	
	public boolean sacar(double valor) {
		// Método do tipo void
		
		/*if (saque <= saldo) {
			saldo = saldo - saque;
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiênte!"); */
		
		// Método do tipo Boolean
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
			
		}
	}
}

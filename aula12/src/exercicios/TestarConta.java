package exercicios;

public class TestarConta {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente("Uelison", "321", 2500);
		try {
			conta.deposito(0);
			conta.saque(200);	
			System.out.println(conta);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do programa");
	}
}

package objetos;

public class TestarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta () ;
		conta1.numero = 123;
		conta1.titular = "Uelison";
		conta1.saldo = 1000;
		
		if (conta1.sacar(900)) {
			System.out.println("Saque efetuado com sucesso! ");
		} else {
			System.out.println("Saldo insuficiente! ");
		}
		
		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Joaquin";
		conta2.saldo = 2000;
		
		if (conta2.sacar(500)) {
			System.out.println("Saque efetuado com sucesso! ");
		} else {
			System.out.println("Saldo insuficiênte! ");
		}
		
		System.out.println("____________________________________");
		System.out.println("Titular da conta:"+conta1.titular);
		System.out.println("Saldo da conta:"+conta1.saldo);
		System.out.println("Nº conta:"+conta1.numero);
		System.out.println("____________________________________");
		System.out.println("Titular da conta:"+conta2.titular);
		System.out.println("Saldo da conta:"+conta2.saldo);
		System.out.println("Nº conta:"+conta2.numero);
		
	}

}

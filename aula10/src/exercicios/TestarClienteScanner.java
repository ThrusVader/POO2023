package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestarClienteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		List<Cliente1> clientes = new ArrayList<>();
		Cliente1 cliente1;
		do {
			System.out.println("Digite o seu nome:");
			String nome = sc.next();
			System.out.println("Digite o seu telefone:");
			String telefone = sc.next();
			System.out.println("Digite o seu ID:");
			int id = sc.nextInt();
			System.out.println("Digite sua idade:");
			int idade = sc.nextInt();
			
			cliente1 = new Cliente1(nome, telefone, id, idade);
			clientes.add(cliente1);
			
			System.out.println("Digite (S/s) para continuar?");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp=='s');
		
		for (Cliente1 c : clientes) {
			System.out.println(c);
		}
	}

}

package exercicios;

import java.util.Scanner;

public class TestarTime {

	public static void main(String[] args) {
		Time time = new Time("Flamengo", "Sampaoli");
		
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		Atleta atleta;
		do {
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Posição:");
			String posicao = sc.next();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			
			atleta = new Atleta(nome, posicao, idade);
			time.adicionarAtleta(atleta);
			
			System.out.println("Digite (S/s) para continuar?");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp == 's');
		System.out.println(time.getNome());
		System.out.println("____________________________________");
		time.imprimirAtletas();
	}

}

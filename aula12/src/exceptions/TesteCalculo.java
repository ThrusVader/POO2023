package exceptions;

import java.util.Scanner;

public class TesteCalculo {

	public static void main(String[] args) {
		//try = tentativa
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor:");
			int num1 = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			int num2 = sc.nextInt();
			System.out.println("__________________________");
			System.out.println("Resultado:" + Calculo.divisão(num1, num2));
			//Calculo calculo = new Calculo();
			//System.out.println("Resultado:"+calculo.divisão(num1, num2));
			
		} catch (ArithmeticException e) {
			System.out.println("Erro ! Divisão por zero ! Verifique o num2");
		}
		
		
	}	

}

package exemplos;

public class Maratona {
	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.95;
		
		if (idade >= 18 | altura >= 1.80) { 
/* Um pipe só testa todas as condições, 2 pipes testa enquanto nao der verdadeiro */
			System.out.println("Atleta participará");
		} else {
			System.out.println("Atleta não participará");	
			
		}
		
	}
}

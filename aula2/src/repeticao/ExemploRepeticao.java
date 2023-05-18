package repeticao;

public class ExemploRepeticao {

	public static void main(String[] args) {
		int cont = 1;
		while (cont <= 10) { // while = enquanto
			System.out.println(cont);
			cont++;
		}
		System.out.println("_____________________________");
		cont = 1;
		do { // do + while = faça + enquanto
			System.out.println(cont);
			cont++;
		} while (cont <= 10);
		
		System.out.println("_____________________________");
		
		for (int i = 1; i <= 10; i++) { //for = para
			if (i>=5 && i<=6) {
				//break; break = pare
			}
			System.out.println(i);
		}
	}

}

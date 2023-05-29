package generics;

public class TestarSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Uelison", 5500);
		Funcionario f2 = new Funcionario("Adriana", 3800);
		Funcionario f3 = new Funcionario("Mariana", 2500);
		Funcionario f4 = new Funcionario("Jorge", 6700);
		
		Sorteio<Funcionario> sorteio = new Sorteio<>();
		
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		
		//Funcionario vencedor = sorteio.realizarSorteio();
		//System.out.println(vencedor);
		System.out.println(sorteio.realizarSorteio());
		
		System.out.println("------Sortear Números------");
		
		Sorteio<Integer> sorteioNumeros = new Sorteio<>();
		sorteioNumeros.adicionar(100);
		sorteioNumeros.adicionar(200);
		sorteioNumeros.adicionar(400);
		sorteioNumeros.adicionar(800);
		
		System.out.println(sorteioNumeros.realizarSorteio());
	}

}

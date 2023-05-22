package exercicios;

import java.util.Arrays;
import java.util.List;

public class TestarLista2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Uelison", "987456987-12", 24);
		Pessoa p2 = new Pessoa("Mario", "123321654-89", 19);
		Pessoa p3 = new Pessoa("Maria", "963368521-02", 22);
		Cliente c1 = new Cliente("Antônio");
		
		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3);
		List<Cliente> clientes = Arrays.asList(c1);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println("______________________________________");
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}

package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TestarLista {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Uelison", "987456987-12", 24);
		Pessoa p2 = new Pessoa("Mario", "123321654-89", 19);
		Pessoa p3 = new Pessoa("Maria", "963368521-02", 22);
		Cliente c1 = new Cliente("Antônio");
		
		List lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(c1);
		
		//size percorre o número de elementos
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Pessoa) {
				Pessoa p = (Pessoa)lista.get(i);
				System.out.println(p.getNome());
			} else {
				Cliente c = (Cliente) lista.get(i);
				System.out.println(c.getNome());
			}
		}
	}
}

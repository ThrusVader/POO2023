package maps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Exemplo2Maps {

	public static void main(String[] args) {
		TreeMap<Integer, String> nomes = new TreeMap<>();
		nomes.put(7, "Uelison");
		nomes.put(23, "Maria");
		nomes.put(39, "Nilo");
		nomes.put(49, "Joao");
		nomes.put(87, "Eliana");
		nomes.put(76, "Taymene");
		nomes.put(19, "Jota");
		
		for (Entry<Integer, String> map : nomes.entrySet()) {
			System.out.println(map.getKey() + " - " + map.getValue());
		}
		System.out.println(nomes.descendingKeySet());
		System.out.println(nomes.descendingMap());
		
		nomes.replace(2, "Maria Joaquina");
		nomes.remove(3);
		System.out.println("______________");
		System.out.println(nomes.get(7));
		System.out.println("______________");
		for (Entry<Integer, String> map : nomes.entrySet()) {
			System.out.println(map.getKey() + " - " + map.getValue());
		}
	}

}

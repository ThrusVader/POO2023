package maps;

import java.util.HashMap;
import java.util.Map;

import exercicios.Produto;

public class Exemplo1Maps {

	public static void main(String[] args) {
		HashMap<String, String> states = new HashMap<>();
		states.put("AC", "ACRE");
		states.put("MG", "MINAS GERAIS");
		states.put("RJ", "RIO DE JANEIRO");
		states.put("SP", "SÃO PAULO");
		
		System.out.println("---Print Keys---");
		for (String keys : states.keySet()) {
			System.out.println(keys);
		}
		System.out.println("---Print Values---");
		for (String values : states.values()) {
			System.out.println(values);
		}
		System.out.println("---Print Key and Values---");
		for (Map.Entry<String, String> map : states.entrySet()) {
			System.out.println(map.getKey() + " - " + map.getValue());
		}
		
		Map<Integer, Produto> produtos = new HashMap<>();
		produtos.put(1, new Produto("Celular", 2500));
		produtos.put(2, new Produto("Radio", 90));
		produtos.put(3, new Produto("TV", 1499));
		
		System.out.println(produtos.values());
	}

}

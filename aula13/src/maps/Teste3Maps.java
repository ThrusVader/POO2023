package maps;

import java.util.HashMap;
import java.util.Map;

public class Teste3Maps {
	public static void main(String[] args) {
		HashMap<String, String> vehicles = new HashMap<>();
		vehicles.put("VW", "Gol");
		vehicles.put("Fiat", "Argo");
		vehicles.put("BMW", "750i");
		vehicles.put("Honda", "Honda Civic");
		vehicles.put("Ford", "Explorer");
		
		System.out.println("---Imprimi apenas Chaves---");
		for (String key : vehicles.keySet()) {
			System.out.println(key);
		}
		System.out.println("---Imprimi Chaves e Valores---");
		for (Map.Entry<String, String> KV : vehicles.entrySet()) {
			System.out.println(KV.getKey() + " - " + KV.getValue());
		}
	}
}

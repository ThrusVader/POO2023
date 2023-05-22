package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		List<String> times = new ArrayList<>();
		times.add("Flamengo");
		times.add("Fluminense");
		times.add("Botafogo");
		times.add("Vasco");

		times.remove(3);
		System.out.println(times);
		for (Object o : times) {
			System.out.println(o);
		}
		System.out.println("Total de times: " + times.size());
		System.out.println(times.get(0));
		times.set(2, "Vasco");
		System.out.println(times.get(2));
		if (times.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Lista preenchida");
		}
		if (times.contains("Flamengo")) {
			System.out.println("Flamengo está na lista");
		} else {
			System.out.println("Não está na lista");
		}
	}
}

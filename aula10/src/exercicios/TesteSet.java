package exercicios;

import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		//HashSet não duplica
		//LinkedSet mantém a ordem que foi enserido 
		//TreeSet mantém a ordema alfabetica
		Set<String> times = new TreeSet<>();
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Vasco");
		times.add("Botafogo");
		times.add("Fluminense");
		
		for (String s : times) {
			System.out.println(s);
		}
	}

}

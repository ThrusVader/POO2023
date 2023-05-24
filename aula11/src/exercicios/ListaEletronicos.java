package exercicios;

import java.util.Set;
import java.util.TreeSet;

public class ListaEletronicos {

	public static void main(String[] args) {
		//Lista de String = ArrayList aceita elementos duplicados
		//Lista de String que não aceita valores repetidos = essa função é do HashSet
		//Lista de String que mantém a ordem da entrada de dados = essa função é do LinkedHashSet
		//Lista de String que pesquisa os elementos e ordena = essa função é do TreeSet
		Set<String> eletronicos = new TreeSet<>(); 
		Set<Double> valores = new TreeSet<>(); 
		
		eletronicos.add("Celular");
		eletronicos.add("TV 42");
		eletronicos.add("Radio");
		eletronicos.add("Relógio");
		
		valores.add(2500.);
		valores.add(3800.);
		valores.add(500.);
		valores.add(750.);
		
		for (String e : eletronicos) {
			System.out.println(e);
		}
		
		for (Double v : valores) {
			System.out.println(v);
		}
		
		System.out.println(eletronicos.contains("Celular")?"Existe":"Não Existe");
	}
}

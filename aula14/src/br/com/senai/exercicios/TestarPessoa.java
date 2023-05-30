package br.com.senai.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Roni", "321", 47);
		Pessoa p2 = new Pessoa("Jaqueline", "123", 41);
		Pessoa p3 = new Pessoa("Ricardo", "456", 22);
		Pessoa p4 = new Pessoa("Gabriel", "654", 19);
		
		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3,p4); // Arrays.asList não permite a inserção de dados depois
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		List<String> frutas = Arrays.asList("Manga", "Abacaxi", "Uva", "Banana");
		Collections.sort(frutas);
		System.out.println(frutas);
		
		List<Integer> numeros = Arrays.asList(10,20,45,9,8,30,7);
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}

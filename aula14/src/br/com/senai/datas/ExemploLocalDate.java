package br.com.senai.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2023, 05, 29));
		System.out.println(LocalDate.parse("2023-05-29"));
		
		System.out.println(hoje.plusDays(30));//adiciona mais a quantidade de dias que vc botar
		System.out.println(hoje.minusDays(2));// puxar a data de 2 dias atrás
		
		System.out.println(hoje.minus(2,ChronoUnit.YEARS));//pega o ano atual e diminui pela a quantidade de anos que vc definir
		
		System.out.println("O ano atual:"+(hoje.isLeapYear()?"Bissexto":"Não é Bissexto")); //vê se o ano é um ano Bissexto
	}
}

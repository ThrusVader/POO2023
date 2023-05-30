package br.com.senai.datas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {
	
	public static void main(String[] args) {
		//LocalDateTime d = LocalDateTime.now();
		//System.out.println(d);
		
		Instant dataDeHoje = Instant.now();
		System.out.println(dataDeHoje);
		
		LocalDateTime dataLocal = LocalDateTime.ofInstant(dataDeHoje, ZoneId.systemDefault());
		System.out.println(dataLocal);
		
		LocalDateTime dataHoraPais = LocalDateTime.ofInstant(dataDeHoje, ZoneId.of("Portugal"));
		System.out.println(dataHoraPais);
		//Instant dataString = Instant.parse("2023-05-30T09:39:00z");
		//System.out.println(dataString);
	}
}

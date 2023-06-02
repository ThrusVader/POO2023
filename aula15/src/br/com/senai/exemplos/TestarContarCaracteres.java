package br.com.senai.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestarContarCaracteres {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\Aula\\disciplinas.txt"));
			int quantidade = 0;
			
			while (bf.ready()) {
				String linha = bf.readLine();
				quantidade = linha.length();
				System.out.println("Quantidade de caracteres:"+ quantidade);
			}
			bf.close();
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo !");
			e.printStackTrace();
		}
	}

}

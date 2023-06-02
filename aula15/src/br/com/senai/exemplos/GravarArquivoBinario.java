package br.com.senai.exemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GravarArquivoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("C:\\Aula\\dados.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(arquivo);
			
			gravarArquivo.writeChars("Senai - Curso de Full Stack 2023 -");
			gravarArquivo.close();
		} catch (IOException e) {
			System.out.println("Problemas ao gravar o arquivo !");
			e.printStackTrace();
		}
	}

}

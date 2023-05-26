package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraException {

	public static void main(String[] args) {
		try {
			String[] vetor = {"Celular","TV","Kindle"};
			FileReader fr = new FileReader("c:\\Aula\\aula.txt");
			System.out.println("Arquivo encontrado"); //checked -- verifica em tempo de projeto
			System.out.println(vetor[4]);
		} catch (FileNotFoundException e) {
			//System.out.println("Arquivo não encontrado !"); //unchecked -- encaminha o problema para frente
			System.out.println("Arquivo não encontrado !");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Índice fora de faixa !");
		} finally {
			System.out.println("Fim de programa.");
		}
	}
}

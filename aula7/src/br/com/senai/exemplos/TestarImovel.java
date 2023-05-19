package br.com.senai.exemplos;

public class TestarImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel("Centro", 289000);
		Imovel imovel2 = new Imovel("Bingen", 310000);
		
		Proprietario p1 = new Proprietario("Geraldo", imovel1);
		Proprietario p2 = new Proprietario("Oswaldo", imovel2);
		
		//Nome do Proprietário
		//Dados do Imóvel que esse proprietário comprou
		//Imposto que o proprietário vai pagar
		
		System.out.println("Nome: " + p1.getNome() + "\n" + p1.getImovel());
		System.out.printf("O Valor do imposto é: " + "%.2f",p1.getImovel().calcularImpostoTrasmissao());
		
		System.out.println("Nome: " + p2.getNome() + "\n" + p1.getImovel());
		System.out.printf("O Valor do imposto é: " + "%.2f",p1.getImovel().calcularImpostoTrasmissao());
		
	}

}
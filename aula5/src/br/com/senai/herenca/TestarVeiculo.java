package br.com.senai.herenca;

public class TestarVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("ABC-0909", "2343", "Azul", 50000, 9000);
		VeiculoPasseio vp = new VeiculoPasseio("ZER-2342", "234", "Branco", 22500, "Sedan");
		Moto m = new Moto("ADS-9890", "689", "Vermelha", 5000, 125);
		
		Veiculo v1 = new Moto("ATA-3540", "340", "Vermelha", 5000, 125);
		Veiculo v2 = new VeiculoPasseio("HAS-0650", "1358", "Azul", 20500, "Hatch");
		
		System.out.println("Dados caminhão: "+ c.getPlaca() + " " + c.getValor());
		System.out.println("O valor do IPVA é: " + c.valorIPVA());
		System.out.println("___________________________________________");
		
		System.out.println("Dados veiculo de passeio: "+ vp.getPlaca() + " " + vp.getValor());
		System.out.println("O valor do IPVA é: " + vp.valorIPVA());
		System.out.println("___________________________________________");
		
		System.out.println("Dados da moto: "+ m.getPlaca() + " " + vp.getValor());
		System.out.println("O valor do IPVA é: " + m.valorIPVA());
	}

}

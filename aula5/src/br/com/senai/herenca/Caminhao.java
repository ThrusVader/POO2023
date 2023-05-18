package br.com.senai.herenca;

public class Caminhao extends Veiculo {
	// extends é Herança para puxar a info de outra classe sem definir as mesmas
	// coisas
	private int cargaMaxima;

	public Caminhao(String placa, String chassi, String cor, double valor, int cargaMaxima) {
		super(placa, chassi, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	//Sobrescrita de método
	@Override //O nome é anotação
	public double valorIPVA() {
		return super.valorIPVA() + 500;
	}
}

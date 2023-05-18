package br.com.senai.exemplos;

public class Casa extends Imovel {
	private boolean garagem;

	public Casa(String local, double valor, boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return super.toString() + " " + (garagem?"Tem Garagem":"Não tem Garagem");
	}

	public boolean isGaragem() {
		return garagem;
	}

	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}

}

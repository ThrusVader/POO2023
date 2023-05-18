package br.com.senai.herenca;

public abstract class ImpostoDeRenda extends Object{
	protected String nome;
	protected String email;
	protected double rendimentos;

	//OVERLOAD
	public ImpostoDeRenda() {
		
	}
	
	public ImpostoDeRenda(String nome, String email, double rendimentos) {
		super();
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	
	}
	
	@Override
	public String toString() {
		return nome + " - " + email + "	- " + rendimentos;
	}
	
	/*public String imprimirDados() {
		return nome + " - " + email + "	- " + rendimentos;
	}
	*/
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	public abstract double imposto();

	
}

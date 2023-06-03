package trab;

public class Empregado {
	protected String nome;
	protected double salarioBruto;
	protected Departamento departamento;

	public Empregado(String nome, double salarioBruto, Departamento departamento) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.departamento = departamento;
	}
	
	

	@Override
	public String toString() {
		return "Empregado nome:" + nome + ", salarioBruto:" + salarioBruto + ", departamento:" + departamento;
	}



	public String getNome() {
		return nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

}

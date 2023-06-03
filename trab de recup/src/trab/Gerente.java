package trab;

public class Gerente extends Empregado implements Calculos {
	private String tipo;

	public Gerente(String nome, double salarioBruto, Departamento departamento, String tipo) {
		super(nome, salarioBruto, departamento);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	@Override
	public double abonoSalarial() {
		return salarioBruto + 100;
	}

	public double calculoValeTrasporte(double valor) {
		return valor = ((salarioBruto+100) * 0.06);
	}

	public double calculoImpostoDeRenda(double valor) {
		if (salarioBruto > 1500) {
			valor = ((salarioBruto+100) * 0.075);
		} else if (salarioBruto > 4000) {
			valor = ((salarioBruto+100) * 0.15);
		}
		return valor;
	}

	public double calculoInss(double valor) {
		if (salarioBruto <= 1751.81) {
			valor = (salarioBruto+100) * 0.08;
		}
		if (salarioBruto >= 1751.81 && salarioBruto <= 2919.72) {
			valor = (salarioBruto+100) * 0.09;
		}
		if (salarioBruto >= 2919.72 && salarioBruto <= 5839.45) {
			valor = (salarioBruto+100) * 0.11;
		}
		if (salarioBruto > 5839.45) {
			valor = (salarioBruto+100) * 0.11;
		}
		return valor;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	
	public double descontos() {
		return (salarioBruto+100) - calculoImpostoDeRenda(salarioBruto+100) - calculoInss(salarioBruto+100) - calculoValeTrasporte(salarioBruto+100);
	}
}

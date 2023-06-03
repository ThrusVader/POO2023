package trab;


public class TestaEmpregado {

	public static void main(String[] args) {
		Departamento dp1 = new Departamento(2, Setor.CPD);
		
		Gerente g = new Gerente("Antônio", 3000, dp1, "Administrativo");
		
		System.out.println("__________________________________________");
		System.out.println("\tTrabalho de Recuperação");
		System.out.println("__________________________________________");
		System.out.println("Nome:"+g.getNome());
		System.out.println("Salário bruto com abono:"+g.abonoSalarial());
		System.out.println("IR:"+g.calculoImpostoDeRenda(0));
		System.out.println("INSS:"+g.calculoInss(0));
		System.out.println("VT:"+g.calculoValeTrasporte(0));
		System.out.println("Descontos IR/Inss/VT:"+g.descontos());
		System.out.println("__________________________________________");
		System.out.println("By:Uelison Couto.");
	}


}

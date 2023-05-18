package exemplos;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Unimed", "Check-up", "321987654");
		Medico medico = new Medico("Golden Cross", "Geraldo", 524138);
		Anestesista anestesista = new Anestesista("Amil", "Jose", 32156, "Geral");
		
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPlano(clinica);
		cp.calcularTotalPlano(medico);
		cp.calcularTotalPlano(anestesista);
		
		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
		
		System.out.println("Total Geral pago pelos planos:"+ String.format("%.2f", cp.getTotalPagoPlano()));
	}

}

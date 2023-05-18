package exemplos;

public class ControlePagamento {
	private double totalPagoPlano;

	public double getTotalPagoPlano() {
		return totalPagoPlano;
	}
	
	public void calcularTotalPlano(Plano p) {
		totalPagoPlano = totalPagoPlano + p.getValorPago();
	}
}

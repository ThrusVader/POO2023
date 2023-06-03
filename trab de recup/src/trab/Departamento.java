package trab;

public class Departamento {
	private Integer codigo;
	private Setor setor;

	public Departamento(Integer codigo, Setor setor) {
		super();
		this.codigo = codigo;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Departamento || Código:" + codigo + " | " + "Setor:" + setor;
	}

	public Setor getSetor() {
		return setor;
	}

}

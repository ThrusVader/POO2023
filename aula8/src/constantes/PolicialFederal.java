package constantes;

public class PolicialFederal extends Policial {
	private String ministerio;

	public PolicialFederal(String cpf, String nome, String ministerio) {
		super(cpf, nome);
		this.ministerio = ministerio;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Ministério:" + ministerio;
	}

	public String getMinisterio() {
		return ministerio;
	}

	public void setMinisterio(String ministerio) {
		this.ministerio = ministerio;
	}
	
	@Override
	public String listarInformacoes() {
		return super.listarInformacoes() + "Ministério:" + ministerio;
	}
}

package exemplos;

public class Categoria {
	private int codigo;
	private String nome;

	public Categoria(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.equals(nome)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", nome=" + nome + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

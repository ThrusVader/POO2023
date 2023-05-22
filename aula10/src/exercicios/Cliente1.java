package exercicios;

public class Cliente1 {
	private String nome, telefone;
	private int id, idade;

	public Cliente1(String nome, String telefone, int id, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.id = id;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente1 - nome:" + nome + " | " + "Telefone: " + telefone + " | " +"Id: " + id + " | " +"Idade: " + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

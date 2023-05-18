package exercicio1;

public class Testar {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("Minas Gerais", "MG");
		Cidade cidade1 = new Cidade("Petrópolis", estado1);
		Cidade cidade2 = new Cidade("Juiz de Fora", estado2);

		Endereco endereco1 = new Endereco("Estrada do Carangola", "Carangola", "25715-221", cidade1);
		Endereco endereco2 = new Endereco("Av. Brasil", "Centro", "26552-520", cidade2);

		Telefone telefone1 = new Telefone("22456913");
		Telefone telefone2 = new Telefone("22468931");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		Contato contato1 = new Contato("Uelison", endereco1);
		Contato contato2 = new Contato("Lucas", endereco2);
		contato1.setTelefones(telefones);
		contato2.setTelefones(telefones);

		System.out.println("Nome: " + contato1.getNome() + " " + contato1.getEndereco().getRua() + " "
				+ contato1.getEndereco().getBairro() + " " + contato1.getEndereco().getCidade().getNomeCidade() + " "
				+ contato1.getEndereco().getCidade().getEstado().getNomeEstado());
		contato1.mostrarTelefones();
	}

}

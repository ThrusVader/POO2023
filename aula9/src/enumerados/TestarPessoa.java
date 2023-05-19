package enumerados;

import enumerados.Pessoa.EstadoCivil;

public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Carlos", "c@gmail.com", Setor.DIRETORIA, EstadoCivil.DIVORCIADO );
		
		System.out.println(pessoa);
		System.out.println("Sala: "+pessoa.getSetor().getSala());
	}

}

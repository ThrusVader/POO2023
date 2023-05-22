package exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo1Arrays {

	public static void main(String[] args) {
		//Arrays.asList pode ser alterado e não pode ser adicionado
		List disciplinas = Arrays.asList("Inglês","Português");
		
		disciplinas.set(0, "Matemática");
		
		System.out.println(disciplinas);
		
		//List.of não pode ser alterado nem adicionado - imutável
		List cores = List.of("Amarelo", "Branco", "Vermelho", "Azul");
		//cores.add("Preto");
		//cores.set(0, "Preto");
	}

}

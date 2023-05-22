package exemplos;

public class TestarFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[3];
		
		funcionarios[0] = new Funcionario("Uelison", 4500);
		funcionarios[1] = new Funcionario("Maria", 3000);
		funcionarios[2] = new Funcionario("Tereza", 4400);
		
		System.out.println(funcionarios[0]);
		System.out.println(funcionarios[1]);
		System.out.println(funcionarios[2]);
		System.out.println("_______________________________________________________");
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i].aumentarSalario(200);
			System.out.println(funcionarios[i]);
		}
	}
}

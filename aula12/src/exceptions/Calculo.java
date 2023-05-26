package exceptions;

public class Calculo {
	
	//throws Encaminhar o erro para frente
	public static int divisão (int num1, int num2) throws ArithmeticException {
		/* Exemplo com Throw = Lança ou Lançar
		if (num2 == 0) {
			throw new ArithmeticException("Erro ! Você dividiu um nº por zero");
		} */
		return num1/num2;
	}
}

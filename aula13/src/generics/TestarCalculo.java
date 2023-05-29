package generics;

public class TestarCalculo {

	public static void main(String[] args) {
		Calculo<Integer> a = new Calculo<Integer>(10);
		Calculo<Double> b = new Calculo<Double>(20.9);
		//Calculo<String> c = new Calculo<String>("TV");
		
		System.out.println(a.getValor());
		System.out.println(b.getValor());
	}

}

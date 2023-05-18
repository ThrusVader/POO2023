package br.com.senai.herenca;

public class TestarImpostoDeRenda {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Fulano", "f@gmail.com", 90000, "233");
		PessoaJuridica pj = new PessoaJuridica("Xpto S/A", "x@gmail.com", 450000, "234");
		
		//System.out.println(pf.imprimirDados());
		//System.out.println(pj.imprimirDados());
		
		System.out.println(pf.toString()); 
		System.out.println(pj.toString());
		System.out.println("O valor à pagar do PF é:" + pf.imposto());
		System.out.println("O valor à pagar do PJ é:" + pj.imposto());	
		
	}

}

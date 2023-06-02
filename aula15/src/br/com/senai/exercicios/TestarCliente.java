package br.com.senai.exercicios;

public class TestarCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Roni", 41, "r@gmail.com");
		Cliente c2 = new Cliente("Roni", 41, "r@gmail.com");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.getIdade().equals(c2.getIdade()));
		
	}
}

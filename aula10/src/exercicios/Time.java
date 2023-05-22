package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome, tecnico;
	private List<Atleta> atletas = new ArrayList<>();

	public Time(String nome, String tecnico) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Time nome:" + nome + " | " + "Tecnico: " + tecnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	public void adicionarAtleta (Atleta a) {
		atletas.add(a);
	}
	
	public void imprimirAtletas() {
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
	}

}

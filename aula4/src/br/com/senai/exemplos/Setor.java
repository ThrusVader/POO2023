package br.com.senai.exemplos;

public class Setor {

	private int codigo;
	private String nome;
	private int qtdeFuncionarios;
	
	//Construtor padrão ou default - sem parâmetros
	public Setor() {
		System.out.println("Construtor vazio");
	}
	
	//Construtor com o nome do setor - com 3 parâmetros
	public Setor(int codigo, String nome, int qtdeFuncionarios) {
		System.out.println("Construtor com 3 parâmetros");
		this.nome = nome;
		this.codigo = codigo;
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	public Setor(String nome) {
		System.out.println("Construtor com nome");
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}

	public void setQtdeFuncionarios(int qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	

}

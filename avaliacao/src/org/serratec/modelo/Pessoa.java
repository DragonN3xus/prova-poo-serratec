package org.serratec.modelo;

public abstract class Pessoa {
	protected String nome,cpf;	
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public abstract void exibirDados();
}

package org.serratec.modelo;

public class Participante extends Pessoa{
	private String email;

	public Participante(String nome, String cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void exibirDados() {
		System.out.printf("Nome: %s | CPF: %s | Email: %s",
				nome, cpf, email); 
	}

}


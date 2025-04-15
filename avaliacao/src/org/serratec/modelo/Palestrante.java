package org.serratec.modelo;

public class Palestrante extends Pessoa {
	private String temaPalestra;

	public Palestrante(String nome, String cpf, String temaPalestra) {
		super(nome, cpf);
		this.temaPalestra = temaPalestra;
	}

	public String getTemaPalestra() {
		return temaPalestra;
	}

	public void setTemaPalestra(String temaPalestra) {
		this.temaPalestra = temaPalestra;
	}

	@Override
	public void exibirDados() {
		System.out.printf("Nome: %s | CPF: %s | Tema da Palestra: %s",
				nome, cpf, temaPalestra); 
	}

}

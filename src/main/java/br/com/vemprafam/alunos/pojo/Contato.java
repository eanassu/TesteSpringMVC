package br.com.vemprafam.alunos.pojo;

public class Contato {
	private String nome;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + "]";
	}
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contato(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
}

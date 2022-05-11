package br.com.vemprafam.alunos.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contato {
	private String nome;
	private String email;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date data;
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
		return "Contato [nome=" + nome + ", email=" + email + ", data=" + data + "]";
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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

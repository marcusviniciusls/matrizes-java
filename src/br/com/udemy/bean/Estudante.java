package br.com.udemy.bean;

public class Estudante {

	// Atributos 
	private String nomeEstudante;
	private String email;
	private int idQuarto;
	
	//Contrutor
	public Estudante(int idQuarto, String nomeEstudante, String email) {
		this.idQuarto = idQuarto;
		this.nomeEstudante = nomeEstudante;
		this.email = email;
	}
	
	// Metódos Get and set
	public String getNomeEstudante() {
		return nomeEstudante;
	}
	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	
	
	
}

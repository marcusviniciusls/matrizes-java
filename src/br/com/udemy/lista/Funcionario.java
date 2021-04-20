package br.com.udemy.lista;

public class Funcionario {
	
	// Atributos
	private Integer id;
	private String name;
	private Double salario;
	
	// Método 
	public void aumentarSalario(double porcentagemAumento) {
		this.salario = (this.salario * ((porcentagemAumento / 100) + 1)); 
	}
	
	// Construtores
	public Funcionario(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public Funcionario() {}
	
	// Métodos Setteres e Getteres
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nNome: " + this.name + "\nSalário: " + this.salario;
	}
	
	

	

}

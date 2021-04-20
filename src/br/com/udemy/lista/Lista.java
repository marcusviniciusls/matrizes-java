package br.com.udemy.lista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		// Testando Lista em Java
		
		Integer qtdFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Funcionarios:"));
		
		
		List<Funcionario> list01 = new ArrayList<>();
		Funcionario func = new Funcionario();
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Cadastro de Funcion�rios");
		
		// Criando fluxo para inser��o dos registros / inserindo informa��es / inserindo na lista
		for(int i =0; i < qtdFuncionario; i++) {	
			
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Funcion�rio"));
			String name = JOptionPane.showInputDialog("Digite o nome do Funcion�rio");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o s�lario do Funcion�rio"));
			
			Funcionario emp = new Funcionario(id,name,salario);
			list01.add(emp);	
			
		}
		
		// Ler o id que vai ser implementado e a porcentagem
		Integer idAlteracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionario para altera��o sal�rial"));
		
		
		// Pesquisar o ID do funcion�rio por uma lista
		Funcionario emp = list01.stream().filter(x -> x.getId() == idAlteracao).findFirst().orElse(null);
		
		if(emp == null) {
			JOptionPane.showMessageDialog(null, "N�o existe Funcion�rio com essa ID");
		} else {
			Double porcentagemAlteracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de aumento"));
			emp.aumentarSalario(porcentagemAlteracao);
		}
		JOptionPane.showMessageDialog(null, emp.getId() + " - " + emp.getName());
		
		// Mostrar funcion�rio na tela
		for(Funcionario x: list01) {
			JOptionPane.showMessageDialog(null, x);
		}

	}

}

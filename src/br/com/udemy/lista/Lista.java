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
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Cadastro de Funcionários");
		
		// Criando fluxo para inserção dos registros / inserindo informações / inserindo na lista
		for(int i =0; i < qtdFuncionario; i++) {	
			
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Funcionário"));
			String name = JOptionPane.showInputDialog("Digite o nome do Funcionário");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario do Funcionário"));
			
			Funcionario emp = new Funcionario(id,name,salario);
			list01.add(emp);	
			
		}
		
		// Ler o id que vai ser implementado e a porcentagem
		Integer idAlteracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionario para alteração salárial"));
		
		
		// Pesquisar o ID do funcionário por uma lista
		Funcionario emp = list01.stream().filter(x -> x.getId() == idAlteracao).findFirst().orElse(null);
		
		if(emp == null) {
			JOptionPane.showMessageDialog(null, "Não existe Funcionário com essa ID");
		} else {
			Double porcentagemAlteracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de aumento"));
			emp.aumentarSalario(porcentagemAlteracao);
		}
		JOptionPane.showMessageDialog(null, emp.getId() + " - " + emp.getName());
		
		// Mostrar funcionário na tela
		for(Funcionario x: list01) {
			JOptionPane.showMessageDialog(null, x);
		}

	}

}

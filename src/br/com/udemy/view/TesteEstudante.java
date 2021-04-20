package br.com.udemy.view;

import javax.swing.JOptionPane;

import br.com.udemy.bean.Estudante;

public class TesteEstudante {

	public static void main(String[] args) {
		
		Estudante[] est1 = new Estudante[10];
		boolean loopQuarto = true;
		
		do {
			JOptionPane.showMessageDialog(null, "Bem Vindo ao Hotel 5 Estrelas Holiday!");
			int numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Quarto: "));
			
			if(est1[numeroQuarto] == null) {		
				est1 = new Estudante[numeroQuarto];
				String nomeEstudante = JOptionPane.showInputDialog("Digite Seu Nome: ");
				String emailEstudante = JOptionPane.showInputDialog("Digite Seu E-mail: ");
				
				
				loopQuarto = false;
				JOptionPane.showMessageDialog(null, "Obrigado pela a preferencia!!!");
			} else {
				JOptionPane.showMessageDialog(null, "Desculpe! Esse quarto já está alugado! \nPor gentileza escolha outro ");
				loopQuarto = true;
			}				
		}while (loopQuarto);
		
		
		// Mostrar quartos alugados
		JOptionPane.showMessageDialog(null, "Quartos Locados");
		
		for( int i = 0; i < 10; i++) {
			if(est1[i] != null) {
				JOptionPane.showMessageDialog(null, "Número: "+ est1[i].getIdQuarto() + "\nNome: "+ est1[i].getNomeEstudante() +
					"\nE-mail: " + est1[i].getEmail());
			} else {
				JOptionPane.showMessageDialog(null, "Quarto: " + i + " Vázio!");
			}
		}
		

	}

}

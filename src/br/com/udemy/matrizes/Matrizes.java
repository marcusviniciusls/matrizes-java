package br.com.udemy.matrizes;

import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {

		// Perguntar para o usuario informar o n�mero de linha e de colunas
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de linhas"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de colunas"));
		// Declara��o de Matrizes
		int[][] mat = new int[n][m];
		
		// Leitura das matrizes
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			}
		}
		
		// Verifica��o de informa��es como (Position - Left - Top - Right - Down)
		int numeroProcesso = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para o Processo"));
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == numeroProcesso) {
					System.out.println("Position: " + i + " - " + j);
					System.out.println("Left: " + mat[i][j-1]);
					System.out.println("Top: " + mat[i-1][j]);
					System.out.println("Right: " + mat[i][j+1]);
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		
		
		// Visualizar as informa��es na tela
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
		}
	}

}

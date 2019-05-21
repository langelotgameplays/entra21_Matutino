package exercicios09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[][] matriz = new int[2][3];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(linha + " " + coluna));
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.println("\n");
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
		}
		System.out.println(" ");
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println("\n");
			for (int linha = 0; linha < matriz.length; linha++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
		}

	}

}
package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Array de numeros
		int[][] numeros = new int[3][2];
		
		//La�os
		//Linhas
		for(int linha=0; linha<3; linha++) {
		
			//Colunas
			for(int coluna=0; coluna<2; coluna++) {
			
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(linha+" "+coluna));
				
			}
			
		}
		
	}

}

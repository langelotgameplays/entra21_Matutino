package exercicios11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String[][] matriz = new String[20][6];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i][0] = JOptionPane.showInputDialog("Informe seu nome");
			matriz[i][1] = JOptionPane.showInputDialog("Informe seu sexo");
			matriz[i][2] = JOptionPane.showInputDialog("Informe sua altura");
			matriz[i][3] = JOptionPane.showInputDialog("Informe seu peso");
			
			
		}

	}
}
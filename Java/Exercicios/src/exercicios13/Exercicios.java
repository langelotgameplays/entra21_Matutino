package exercicios13;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		
		//JOptionPane.showMessageDialog(null, numero -1);
		//JOptionPane.showMessageDialog(null, numero +1);
		System.out.println(numero -1);
		System.out.println(numero +1);
		
	}

	}



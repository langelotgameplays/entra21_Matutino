package exercicios19;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double S = Double.parseDouble(JOptionPane.showInputDialog("Insira a Espa�o percorrido"));
		double T = Double.parseDouble(JOptionPane.showInputDialog("Insira a Tempo utilizado para percorrer o espa�o informado"));
		
		System.out.println(S/T);
		

	}

}

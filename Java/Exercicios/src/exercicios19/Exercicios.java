package exercicios19;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double S = Double.parseDouble(JOptionPane.showInputDialog("Insira a Espaço percorrido"));
		double T = Double.parseDouble(JOptionPane.showInputDialog("Insira a Tempo utilizado para percorrer o espaço informado"));
		
		System.out.println(S/T);
		

	}

}

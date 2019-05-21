package exercicio09;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));

		       if((numero1 < numero2) && (numero1 < numero3)) {
			System.out.println("O menor numero é: "+numero1);
		 
		 }else if((numero2 < numero1) && (numero2 < numero3)) {
			System.out.println("O menor numero é: "+numero2);
		 
		 }else if((numero3 < numero1) && (numero3 < numero2)) {
			System.out.println("O menor numero é: "+numero3);
		}
		
	}

}

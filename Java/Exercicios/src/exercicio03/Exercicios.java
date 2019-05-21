package exercicio03;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota1")); 
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota2")); 
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota3")); 
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota4")); 
		double media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}else if(media >= 5) {
			JOptionPane.showMessageDialog(null, "Recuperação");
		}else if(media < 5) {
			JOptionPane.showMessageDialog(null, "Reprovado");
			
		}
		
	}
	
	

}

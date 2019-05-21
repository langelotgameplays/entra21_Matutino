package exercicios11;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("nota 3"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("nota 4"));
		double falta = Double.parseDouble(JOptionPane.showInputDialog("Faltas"));
		double media = (nota1+nota2+nota3+nota4)/4;
		 	   
		       
		       if(falta > 15){
		    	   JOptionPane.showMessageDialog(null, "Reprovado");
		 }else if(media == 10){
				   JOptionPane.showMessageDialog(null, "Parabéns");
		 }else if(media >= 9){
				   JOptionPane.showMessageDialog(null, "Ótimo");
		 }else if(media >= 7){
				   JOptionPane.showMessageDialog(null, "Bom");
		 }else if(media >= 5){
				   JOptionPane.showMessageDialog(null, "Exame");
		 }else if(media < 5){
				   JOptionPane.showMessageDialog(null, "Reprovado");
		 }else{
			 
  }

 }
	
}
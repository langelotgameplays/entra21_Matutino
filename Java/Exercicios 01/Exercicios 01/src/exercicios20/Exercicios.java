package exercicios20;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
			Object[] estados1 = {"Paran�", "Santa Catarina", "Rio Grande do Sul"};

			int estado = JOptionPane.showOptionDialog(null,"Escolha um estado",
			"Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,estados1,estados1[0]);
	
	
			  if(estado == 0)	{
			
			Object[] cidades1 = {"Curitiba", "Maring�", "Foz do Igua�u"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades1,cidades1[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Curitiba � de 1.8 milh�es de pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Maring� � de 400 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Foz do Igua�u � de 260 mil pessoas");
		}
		
		}else if(estado == 1){
			
			Object[] cidades2 = {"Florian�polis", "Itaja�", "Blumenau"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades2,cidades2[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Florian�polis � de 480 mil pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Itaja� � de 200 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Blumenau � de 310 mil pessoas");
		}
		
		}else if(estado == 2){
			
			Object[] cidades3 = {"Porto Alegre", "Uruguaiana", "Rio Grande"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades3,cidades3[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Porto Alegre � de 1.5 milh�es de pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Uruguaiana � de 120 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A popula��o atual de Rio Grande � de 200 mil pessoas");
				  
   }
			  
  }
			  
 }
	
}
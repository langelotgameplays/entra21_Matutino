package exercicios20;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
			Object[] estados1 = {"Paraná", "Santa Catarina", "Rio Grande do Sul"};

			int estado = JOptionPane.showOptionDialog(null,"Escolha um estado",
			"Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,estados1,estados1[0]);
	
	
			  if(estado == 0)	{
			
			Object[] cidades1 = {"Curitiba", "Maringá", "Foz do Iguaçu"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades1,cidades1[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A população atual de Curitiba é de 1.8 milhões de pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A população atual de Maringá é de 400 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A população atual de Foz do Iguaçu é de 260 mil pessoas");
		}
		
		}else if(estado == 1){
			
			Object[] cidades2 = {"Florianópolis", "Itajaí", "Blumenau"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades2,cidades2[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A população atual de Florianópolis é de 480 mil pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A população atual de Itajaí é de 200 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A população atual de Blumenau é de 310 mil pessoas");
		}
		
		}else if(estado == 2){
			
			Object[] cidades3 = {"Porto Alegre", "Uruguaiana", "Rio Grande"};

			  int cidade = JOptionPane.showOptionDialog(null,"Escolha um estado","Estados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cidades3,cidades3[0]);
		
			  if(cidade == 0) {
				  JOptionPane.showMessageDialog(null, "A população atual de Porto Alegre é de 1.5 milhões de pessoas");
		}else if(cidade == 1) {
				  JOptionPane.showMessageDialog(null, "A população atual de Uruguaiana é de 120 mil pessoas");
		}else if(cidade == 2) {
				  JOptionPane.showMessageDialog(null, "A população atual de Rio Grande é de 200 mil pessoas");
				  
   }
			  
  }
			  
 }
	
}
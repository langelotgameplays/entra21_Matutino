package exercicios06;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		String nome, media;  
		short sFem=0, sMas=0;
		String n1, n2, n3, n4;		
				
        nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
          
        while (!nome.equalsIgnoreCase("sair")){  
           n1 = (JOptionPane.showInputDialog("Insira sua 1° nota"));
           n2 = (JOptionPane.showInputDialog("Insira sua 2° nota"));
           n3 = (JOptionPane.showInputDialog("Insira sua 3° nota"));
           n4 = (JOptionPane.showInputDialog("Insira sua 4° nota"));
           media = (n1+n2+n3+n4);
        
        	
        	
        	
        nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
  }  
  
 }

}

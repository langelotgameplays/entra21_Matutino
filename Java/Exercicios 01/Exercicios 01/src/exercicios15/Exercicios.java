package exercicios15;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		String hotel = (JOptionPane.showInputDialog("Selecione umas das Opções: \nApto simples\nApto duplo\nSuíte luxo"));
		double dias = Double.parseDouble(JOptionPane.showInputDialog("Quantos dias você ficará?"));
		String apt1 = ("Apto simples");
		String apt2 = ("Apto duplo");
		
		      if(hotel.equals(apt1)) {
		    	  JOptionPane.showMessageDialog(null, "Voce escolheu o Apto simples e ele custara R$:"+45*dias);
		}else if(hotel.equals(apt2)) {
				  JOptionPane.showMessageDialog(null, "Voce escolheu o Apto duplo e ele custara R$:"+65*dias);
		}else {
				  JOptionPane.showMessageDialog(null, "Voce escolheu o Suíte de luxo e ele custara R$:"+110*dias);
				  
  }
		
 }
			
}



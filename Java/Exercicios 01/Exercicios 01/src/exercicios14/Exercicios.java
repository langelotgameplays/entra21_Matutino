package exercicios14;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		
			  if(valor <= 12000) {
				 double distribuidor = (valor*0.95);
				  	JOptionPane.showMessageDialog(null, "O valor do produto � R$"+distribuidor);
				  	JOptionPane.showMessageDialog(null, "O percentual repassado ao distribuidor � de: 5%");
				  	JOptionPane.showMessageDialog(null, "O percentual de impostos arrecadados  � de: isento");
		}else if(valor <= 25000) {
				 double distribuidor = (valor*0.90);
				 double impostos = (distribuidor*0.85);
				 	JOptionPane.showMessageDialog(null, "O valor do produto � R$"+impostos);
				 	JOptionPane.showMessageDialog(null, "O percentual repassado ao distribuidor � de: 10%");
				 	JOptionPane.showMessageDialog(null, "O percentual de impostos arrecadados  � de: 15%");
		}else if(valor > 25000) {
				 double distribuidor = (valor*0.85);
				 double impostos = (distribuidor*0.80);
				 	JOptionPane.showMessageDialog(null, "O valor do produto � R$"+impostos);
				 	JOptionPane.showMessageDialog(null, "O percentual repassado ao distribuidor � de: 15%");
				 	JOptionPane.showMessageDialog(null, "O percentual de impostos arrecadados  � de: 20%");
		}else {
  }

 }
	
}
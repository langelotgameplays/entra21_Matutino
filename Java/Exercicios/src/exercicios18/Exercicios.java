package exercicios18;

import javax.swing.JOptionPane;

public class Exercicios {
	
	public static void main(String[] args) {
		
	
	
	double l1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	double l2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	double l3 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	
		  if((l1 > l2+l3) || (l2 > l1+l3) || (l3 > l1+l2)) {
		JOptionPane.showMessageDialog(null, "N�o � um tri�ngulo");
	}else if(((l1 == l2) && (l2 != l3)) || (l1 == l3) && (l2 != l1)) {
		JOptionPane.showMessageDialog(null, "� um triangulo is�sceles");
	}else if((l1 == l2) && (l1 == l3) && (l2 == l3)) {
		JOptionPane.showMessageDialog(null, "� um triangulo eq�il�tero");
	}else if((l1 != l2) || (l1 != l3) || (l2 != l3)){
		JOptionPane.showMessageDialog(null, "� um triangulo escaleno");
	}else {
		
		}	
	}
}

package exercicios18;

import javax.swing.JOptionPane;

public class Exercicios {
	
	public static void main(String[] args) {
		
	
	
	double l1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	double l2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	double l3 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
	
		  if((l1 > l2+l3) || (l2 > l1+l3) || (l3 > l1+l2)) {
		JOptionPane.showMessageDialog(null, "Não é um triângulo");
	}else if(((l1 == l2) && (l2 != l3)) || (l1 == l3) && (l2 != l1)) {
		JOptionPane.showMessageDialog(null, "É um triangulo isósceles");
	}else if((l1 == l2) && (l1 == l3) && (l2 == l3)) {
		JOptionPane.showMessageDialog(null, "É um triangulo eqüilátero");
	}else if((l1 != l2) || (l1 != l3) || (l2 != l3)){
		JOptionPane.showMessageDialog(null, "É um triangulo escaleno");
	}else {
		
		}	
	}
}

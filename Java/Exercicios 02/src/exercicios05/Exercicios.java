package exercicios05;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		String nome = (JOptionPane.showInputDialog("Informe o nome do produto"));
		int q1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		JOptionPane.showMessageDialog(null, nome);
		
			  if(q1 == 1) {
			JOptionPane.showMessageDialog(null, (2*q1)-0.1);
		}else if(q1 == 2) {
			JOptionPane.showMessageDialog(null, (2*q1)-0.4);
		}else if(q1 == 3) {
			JOptionPane.showMessageDialog(null, (2*q1)-0.9);
		}else if(q1 == 4) {
			JOptionPane.showMessageDialog(null, (2*q1)-1.6);
		}else if(q1 == 5) {
			JOptionPane.showMessageDialog(null, (2*q1)-2.5);
		}else if(q1 == 6) {
			JOptionPane.showMessageDialog(null, (2*q1)-3.6);
		}else if(q1 == 7) {
			JOptionPane.showMessageDialog(null, (2*q1)-4.9);
		}else if(q1 == 8) {
			JOptionPane.showMessageDialog(null, (2*q1)-6.4);
		}else if(q1 == 9) {
			JOptionPane.showMessageDialog(null, (2*q1)-8.1);
		}else if(q1 == 10) {
			JOptionPane.showMessageDialog(null, (2*q1)-10);
		}else {
		
		}

	}
	
}
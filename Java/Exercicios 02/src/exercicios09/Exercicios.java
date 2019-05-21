package exercicios09;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		int indice=0;
		
		if(n1 > n2) {
			indice = n1;
			
			while(indice >= n2) {
				System.out.println(indice);
				indice--;
			}
			
		}else {
			indice = n1;
			
			while(indice <= n2) {
				System.out.println(indice);
				indice++;
				
			}
			
		}
		
	}
	
}
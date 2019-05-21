package exercicios06;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		
		if(numero1 == numero2) {
			System.out.println(numero1+numero2);
		}else {
			System.out.println(numero1*numero2);
			
			String mensagem = "Resultado: ";
			
			JOptionPane.showMessageDialog(null, mensagem);
		}
	
	}

}

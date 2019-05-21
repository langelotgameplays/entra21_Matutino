package exercicios02;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
										  JOptionPane.showMessageDialog(null, "O valor final é de R$"+valor*0.90);
 }

}

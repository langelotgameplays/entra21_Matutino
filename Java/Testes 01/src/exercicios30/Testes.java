package exercicios30;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		double valor   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora"));
		double horas   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora"));
		double horas2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora"));
		double horas3  = horas2*2;
		double valor2  = valor*(horas2+horas3);
		JOptionPane.showMessageDialog(null, "O salario bruto será de R$"+valor2);
 }

}

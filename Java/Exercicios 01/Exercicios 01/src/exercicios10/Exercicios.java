package exercicios10;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double m1 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$0,01 voc� tem?"));
		double m2 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$0,05 voc� tem?"));
		double m3 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$0,10 voc� tem?"));
		double m4 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$0,25 voc� tem?"));
		double m5 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$0,50 voc� tem?"));
		double m6 = Double.parseDouble(JOptionPane.showInputDialog("Quantas moedas de R$1,00 voc� tem?"));
		
		System.out.println("O resultado � R$"+(m1*0.01+m2*0.05+m3*0.10+m4*0.25+m5*0.50+m6));
		
 }

}

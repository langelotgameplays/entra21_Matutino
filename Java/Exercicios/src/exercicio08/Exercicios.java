package exercicio08;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Forneça o numero"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Forneça outro numero"));
		String operacao = (JOptionPane.showInputDialog("Forneça o tipo de operação"));
		
			 if(operacao.equals("soma")) {
		System.out.println("O resultado da soma é "+(numero1+numero2));
		
			 }else if(operacao.equals("subtração")) {
		System.out.println("O resultado da subtração é "+(numero1-numero2));
		
			 }else if(operacao.equals("divisão")) {
		System.out.println("O resultado da divisão é "+(numero1/numero2));
		
			 }else if(operacao.equals("multiplicação")) {
		System.out.println("O resultado da multiplicação é "+(numero1*numero2));
		
		
		//String mensagem = "Resultado"+operacao;
		//JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}
		}
		
		
		

	}



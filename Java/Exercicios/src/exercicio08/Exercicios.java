package exercicio08;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Forne�a o numero"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Forne�a outro numero"));
		String operacao = (JOptionPane.showInputDialog("Forne�a o tipo de opera��o"));
		
			 if(operacao.equals("soma")) {
		System.out.println("O resultado da soma � "+(numero1+numero2));
		
			 }else if(operacao.equals("subtra��o")) {
		System.out.println("O resultado da subtra��o � "+(numero1-numero2));
		
			 }else if(operacao.equals("divis�o")) {
		System.out.println("O resultado da divis�o � "+(numero1/numero2));
		
			 }else if(operacao.equals("multiplica��o")) {
		System.out.println("O resultado da multiplica��o � "+(numero1*numero2));
		
		
		//String mensagem = "Resultado"+operacao;
		//JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}
		}
		
		
		

	}



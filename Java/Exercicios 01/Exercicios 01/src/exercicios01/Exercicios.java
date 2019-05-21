package exercicios01;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
	
	String nome  = JOptionPane.showInputDialog(null, "Qual o seu nome");
	String idade = JOptionPane.showInputDialog(null, "Qual a sua idade");
	String onde  = JOptionPane.showInputDialog(null, "Onde você mora");
	
	String mensagem = "Nome: "+nome;
		   mensagem+= "\nIdade: "+idade;
		   mensagem+= "\nMora em: "+onde;
		   		   JOptionPane.showMessageDialog(null, mensagem);
		    
 }
	
}

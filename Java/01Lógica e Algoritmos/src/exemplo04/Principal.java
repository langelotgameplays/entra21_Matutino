package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args){
		
		/*Exibir mensagem
		JOptionPane.showMessageDialog(null, "Bom dia!");
		JOptionPane.showMessageDialog(null, "Tudo ok?", "Titulo", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Informação", "Titulo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo" , "Titulo", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Falha" , "Titulo", JOptionPane.ERROR_MESSAGE);
		*/
		
		/*Armazenar valores
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		//JOptionPane.showMessageDialog(null, "Bom dia \n"+nome);
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		String mensagem = "Nome: "+nome;
			   mensagem+= "\nIdade: "+idade;
			   mensagem+= "\nAltura: "+altura;			   
	    JOptionPane.showMessageDialog(null, mensagem);
	    */
		
		/*Caixa de confirmação
		
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		//JOptionPane.showMessageDialog(null, resposta);
		switch(resposta) {
			case 0:
				JOptionPane.showMessageDialog(null, "Que bom!");
			break;
		
			case 1:
				JOptionPane.showMessageDialog(null, "Que pena");
			break;
		
			case 2:
				JOptionPane.showMessageDialog(null, "Você cancelou");
			break;
		
			default:
				JOptionPane.showMessageDialog(null, "Você saiu");
		
		
		}
		*/
		
		//Caixa de confirmação 2
		//int resposta = JOptionPane.showConfirmDialog(null, "Hoje é terça?", "titulo", JOptionPane.OK_CANCEL_OPTION);
		
		//Comparando Strings
		String nome1 = JOptionPane.showInputDialog("Informe o primeiro nome");
		String nome2 = JOptionPane.showInputDialog("Informe o segundo nome");
		
		System.out.println(nome1.equals(nome2));
		
	}

}

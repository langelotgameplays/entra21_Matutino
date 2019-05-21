package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variavel de validação
		boolean valida = false;
		
		//Obter a idade
		do {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma Idade"));
				valida = true;
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Favor informar um número inteiro");
			}
			
		}while(valida == false);

	}

}

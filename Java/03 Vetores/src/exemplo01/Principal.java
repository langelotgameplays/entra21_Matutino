package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor � um tipo de vari�vel que armazena varios dados
		String[] nomes = new String[3];
		
		//Pedir os tr�s nomes
		nomes[0] = JOptionPane.showInputDialog("Primeiro nome");
		nomes[1] = JOptionPane.showInputDialog("Segundo nome");
		nomes[2] = JOptionPane.showInputDialog("Terceiro nome");
		
		//Exibir os nomes
		String exibirNomes = nomes[0];
		       exibirNomes+= "\n"+nomes[1];
		       exibirNomes+= "\n"+nomes[2];
		JOptionPane.showMessageDialog(null, exibirNomes);
		
		
		
	}

}

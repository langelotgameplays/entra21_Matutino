package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetores
		String[] nomes = new String[20];
		int[] idade = new int[20];
		
		//Variaveis
		int indice =0;
		int verificarContinuar;
		boolean continuar = true;
		
		//Laço
		do {
		
				//Obter dador
				nomes[indice] = JOptionPane.showInputDialog("informe o "+(indice+1)+"º nome");
				idade[indice] = Integer.parseInt(JOptionPane.showInputDialog("informe a "+(indice+1)+"º idade"));
			
				//Incrementar o indice
				indice++;
				
				//Verificar se quer continuar
				verificarContinuar = JOptionPane.showConfirmDialog(null, "Continuar");
				if(verificarContinuar != 0) {
					continuar = false;
				}
		
		}while(continuar == true);
		
		//Exibir mensagem contendo os nomes e idades
		String mensagem = "Dados";
		
		for(int i = 0; i < nomes.length; i++) {
		
			if(nomes[i] != null) {
			mensagem+="\nNome:"+nomes[i]+" - idade: "+idade[i];
			}
		
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	
	}

		
}
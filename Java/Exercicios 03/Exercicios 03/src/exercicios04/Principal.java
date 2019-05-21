package exercicios04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome, a = null, b = null, c = null, d = null;
		String[] gabarito = new String[10];

		/*gabarito[0] = a; gabarito[1] = d; gabarito[2] = c; gabarito[3] = b; gabarito[4] = c;
		gabarito[5] = c; gabarito[6] = b; gabarito[7] = a; gabarito[8] = d; gabarito[9] = c;*/
		
		for(int i = 0; i < gabarito.length; i++) {
			gabarito[i] = JOptionPane.showInputDialog("Informe a resposta da "+(i+1)+"º questão");
			
			
		}

	}
}

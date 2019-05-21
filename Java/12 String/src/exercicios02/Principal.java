package exercicios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int vogais = 0;
		String pf = JOptionPane.showInputDialog("Insira uma palavra ou frase");

		pf = pf.toLowerCase();

		for (int i = 0; i < pf.length(); i++) {
			if(pf.charAt(i) == 'a' || pf.charAt(i) == 'e' || pf.charAt(i) == 'i' || pf.charAt(i) == 'o' || pf.charAt(i) == 'u') {
				vogais++;
			}
		}
		System.out.println("Quantidade de vogais = "+vogais);
	}

}

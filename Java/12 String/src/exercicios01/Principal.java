package exercicios01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String pf = JOptionPane.showInputDialog("Insira uma palavra ou frase");
		String resp = "";

		for (int i = 0; i < pf.length(); i++)
			if (i % 2 == 0) {
				pf = pf.toUpperCase();
				resp += pf.charAt(i);
			} else {
				pf = pf.toLowerCase();
				resp += pf.charAt(i);
			}
		
		System.out.println(resp);
		
	}

}
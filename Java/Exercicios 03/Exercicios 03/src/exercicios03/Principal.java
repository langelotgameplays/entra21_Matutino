package exercicios03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		int numdez = 0, num = 0;
		for (int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (indice + 1) + "º numero"));
		}
		for (int indice = 0; indice < numeros.length; indice++) {
			if (numeros[indice] == 10) {
				numdez = (indice + 1);
			} else {
				num = (indice + 1);
			}

		}
		System.out.println(numdez);
		System.out.println(num);

	}

}

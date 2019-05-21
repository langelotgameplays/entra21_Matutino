package exercicios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	int numeros = 0;
	int[] numerosInverter = new int [10];
		for(int indice = 0; indice < 10; indice++) {
			numerosInverter[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"º numero"));
			numeros = numerosInverter[9-indice];
			numerosInverter[9-indice] = numerosInverter[indice];
			numerosInverter[indice] = numeros;
		}
		for(int indice = 0; indice < 10; indice++) {
			System.out.println(numerosInverter[indice]);
		}
			
	}
	
	
}
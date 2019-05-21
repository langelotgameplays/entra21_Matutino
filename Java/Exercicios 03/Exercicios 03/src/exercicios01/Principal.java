package exercicios01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int[] n1 = new int [10];
		int[] n2 = new int [10];
		Object[] operação = {"Soma", "Subtração", "Multiplicação",  "Divisão"};
		
		for(int indice = 0; indice < n1.length; indice++) {
			n1[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"º numero"));
		}
		for(int indice = 0; indice < n2.length; indice++) {
			n2[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"º numero"));
		}
		int operação1 = JOptionPane.showOptionDialog(null,"Informe o tipo da operação","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,operação,operação[0]);
			if(operação1 == 0) {
				for(int indice = 0; indice < n1.length; indice++) {
					System.out.println(n1[indice]+n2[indice]);
				}
			}else if(operação1 == 1) {
				for(int indice = 0; indice < n1.length; indice++) {
					System.out.println(n1[indice]-n2[indice]);
				}
			}else if(operação1 == 2) {
				for(int indice = 0; indice < n1.length; indice++) {
					System.out.println(n1[indice]*n2[indice]);
				}
			}else if(operação1 == 3) {
				for(int indice = 0; indice < n1.length; indice++) {
					System.out.println(n1[indice]/n2[indice]);
				}
			}	
		}
	
}
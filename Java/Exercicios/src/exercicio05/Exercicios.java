package exercicio05;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double dia = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o dia"));
		
		if((dia < 0) || (dia > 28)){
			JOptionPane.showMessageDialog(null, "Data invalida");
		}else if(dia == 3 || dia == 4 || dia == 10 || dia == 11 || dia == 17 || dia == 18 || dia == 24 || dia == 25 ) {
			JOptionPane.showMessageDialog(null, "Final de semana");
		}else {
			JOptionPane.showMessageDialog(null, "Dia de semana");
		}
			
	}
			
}
		




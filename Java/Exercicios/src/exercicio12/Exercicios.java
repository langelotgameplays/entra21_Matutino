package exercicio12;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double vp = Double.parseDouble(JOptionPane.showInputDialog("Velocidade máxima da pista?"));
		double vc = Double.parseDouble(JOptionPane.showInputDialog("Velocidade do carro?"));
		double r = (vc-vp);
		
		if(r<=0) {
			JOptionPane.showMessageDialog(null, "Bom motorista");
		}else if((r>=0) && (r <= 10)) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$50,00");
		}else if(r <= 30) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$100,00");
		}else if(r > 30) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$200,00");
		}
		
			
			
			/*if(vc < vp) {
			JOptionPane.showMessageDialog(null, "Bom motorista");
		}else if(vc > vp) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$50,00");
		}else if(vc > vp) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$100,00");
		}else if(vc > vp) {
			JOptionPane.showMessageDialog(null, "Você recebeu uma multa de R$200,00");*/
		
	}
}


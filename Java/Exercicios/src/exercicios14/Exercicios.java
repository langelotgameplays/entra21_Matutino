package exercicios14;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do veiculo"));
		
			  if(valor <= 12000) {
		double distribuidor = (valor*0.95);
				JOptionPane.showMessageDialog(null, "O valor do produto é de R$: "+distribuidor);
				JOptionPane.showMessageDialog(null, "\nO percentual do distribuidor é 5%");
				JOptionPane.showMessageDialog(null, "\nImpostos arrecadador repassados ao distribuidor: Isento");
		}else if(valor <= 25000) {
			double distribuidor = (valor*0.90);
			double impostos = (distribuidor*0.85);
				JOptionPane.showMessageDialog(null, "O valor do produto é de R$: "+impostos);
				JOptionPane.showMessageDialog(null, "\nO percentual do distribuidor é 10%");
				JOptionPane.showMessageDialog(null, "\nO valor dos impostos arrecadados é 15%");
		}else if(valor > 25000) {
			double distribuidor = (valor*0.85);
			double impostos = (distribuidor*0.80);
				JOptionPane.showMessageDialog(null, "O valor do produto é de R$: "+impostos);
				JOptionPane.showMessageDialog(null, "\nO percentual do distribuidor é 15%");
				JOptionPane.showMessageDialog(null, "\nO valor dos impostos arrecadados é 20%");
		}else {
			
		}

	}

}

package exercicios01v2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Object[] opcoes1 = { "+", "-", "x", "÷", "Sin", "Cos", "Tan", "Log", "²√", "³√" };
		double valor1, valor2;

		switch (JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Sistema",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes1, opcoes1[0])) {

		case 0:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
			JOptionPane.showMessageDialog(null, valor1 + valor2);

			break;

		case 1:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
			JOptionPane.showMessageDialog(null, valor1 - valor2);

			break;

		case 2:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
			JOptionPane.showMessageDialog(null, valor1 * valor2);

			break;

		case 3:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
			JOptionPane.showMessageDialog(null, valor1 / valor2);

			break;

		case 4:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			valor1 = (valor1 * Math.PI) / 180;
			JOptionPane.showMessageDialog(null, Math.sin(valor1));

			break;
			
		case 5:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			
			
			break;
			
		case 6:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			
			
			break;
			
		case 7:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null, Math.log(valor1));
			
			break;
			
		case 8:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null, Math.sqrt(valor1));
			
			break;
			
		case 9:
			valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
			JOptionPane.showMessageDialog(null, Math.cbrt(valor1));
			
			break;
		}

	}

}

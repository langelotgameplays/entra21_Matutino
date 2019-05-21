package exercicios02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int chute = 0, lmtMinimo = 0, lmtMaximo = 100, nAleatorio, numeroMe10 = -10, numeroMa10 = 10, numeroMe20 = -20,
				numeroMa20 = 20, qntChutes = 0;
		double randon = Math.random();

		nAleatorio = (int) Math.round(lmtMinimo + randon * lmtMaximo);

		numeroMe10 += nAleatorio;
		numeroMa10 += nAleatorio;
		numeroMe20 += nAleatorio;
		numeroMa20 += nAleatorio;

		while (chute != nAleatorio) {

			chute = Integer.parseInt(JOptionPane.showInputDialog("De um chute (0 a 100)"));

			if (chute != nAleatorio) {
				if ((chute >= numeroMe10) && (chute <= numeroMa10)) {
					JOptionPane.showMessageDialog(null, "Voc� est� perto");
				} else if ((chute >= numeroMe20) && (chute <= numeroMa20)) {
					JOptionPane.showMessageDialog(null, "Voc� est� longe");
				} else {
					JOptionPane.showMessageDialog(null, "Voc� est� Muito longe");
				}
			}
			qntChutes++;
		}

		JOptionPane.showMessageDialog(null, "Voc� precisou de " + qntChutes + " tentativas");

		if (qntChutes == 1) {
			JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca");
		} else if (qntChutes <= 5) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� � bom de adivinha��o");
		} else if (qntChutes <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
		} else if (qntChutes <= 20) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
		} else if (qntChutes > 20) {
			JOptionPane.showMessageDialog(null, "Meio lerdo voc�, hein");
		} else {
		}
	}

}

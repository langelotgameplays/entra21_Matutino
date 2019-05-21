package exercicios01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int qnt = 0;
		while (qnt != 15) {

			int lmtMinimo1 = -50, lmtMaximo1 = 150, lmtMinimo2 = 50, lmtMaximo2 = 200, lmtMinimo3 = 1, lmtMaximo3 = 5,
					n1, n2, n3, i;

			double randon = Math.random();

			n1 = (int) Math.round(lmtMinimo1 + randon * lmtMaximo1);
			n2 = (int) Math.round(lmtMinimo2 + randon * lmtMaximo2);
			n3 = (int) Math.round(lmtMinimo3 + randon * lmtMaximo3);
			i = (int) Math.round(0 + randon * 3);

			ArrayList<Object[]> aleatorio = new ArrayList<Object[]>();

			Object[] r1 = { n1 + n2, n1 - n2 + n3, n1 + n2 - n3, n1 - n2 * n3 };

			Object[] r2 = { n1 + n2, n1 - n2 + n3, n1 + n2 - n3, n1 - n2 * n3 };

			Object[] r3 = { n1 - n2 * n3, n1 + n2, n1 - n2 + n3, n1 + n2 - n3 };

			Object[] r4 = { n1 + n2 - n3, n1 - n2 * n3, n1 + n2, n1 - n2 + n3 };

			Object[] r5 = { n1 - n2 + n3, n1 + n2 - n3, n1 - n2 * n3, n1 + n2 };

			Object[] r6 = { n1 + n2, n1 - n2 + n3, n1 + n2 - n3, n1 - n2 * n3 };

			aleatorio.add(r1);
			aleatorio.add(r2);
			aleatorio.add(r3);
			aleatorio.add(r4);
			aleatorio.add(r5);
			aleatorio.add(r6);

			int questoes = JOptionPane.showOptionDialog(null, "Qual o resultado da operação " + n1 + " + " + n2,
					"Prova", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, aleatorio.get(i), null);

			if(questoes == 0) {
				
			}
			
			qnt++;
		}

	}
}

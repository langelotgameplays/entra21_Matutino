package exercicios32;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		double or�amento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu or�amento"));
		JOptionPane.showMessageDialog(null, "  5%   -     30 dias   -   R$"+or�amento*1.05+" \n10%   -     60 dias   -   R$"+or�amento*1.10+" \n20%   -     90 dias   -   R$"+or�amento*1.20+
											"\n30%   -   120 dias   -   R$"+or�amento*1.30+"\n40%   -   180 dias   -   R$"+or�amento*1.40+"\n50%   -   270 dias   -   R$"+or�amento*1.50);

 }

}

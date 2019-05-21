package exercicios16;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		String n = (JOptionPane.showInputDialog("Informe o numero do pedido"));
		double pag = Double.parseDouble(JOptionPane.showInputDialog("O pagamento por favor"));
		String p1  = ("1");
		String p2  = ("2");
		String p3  = ("3");
		String p4  = ("4");
		String p5  = ("5");
		String p6  = ("6");
		
			  if(n.equals(p1)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Hambúrguer + Suco de Laranja com custo de R$5,00");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-5));
		}else if(n.equals(p2)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Sanduíche natural + Suco de Uva com custo de R$4,50");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-4.5));
		}else if(n.equals(p3)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Prato do dia com custo de R$8,00");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-8));
		}else if(n.equals(p4)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Pizza com custo de R$12,00");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-12));
		}else if(n.equals(p5)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Lasanha com custo de R$16,50");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-16.5));
		}else if(n.equals(p6)) {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Pão de queijo com custo de R$1,00");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-1));
		}else {
				JOptionPane.showMessageDialog(null, "Voce escolheu: Bolo com custo de R$2,50");
				JOptionPane.showMessageDialog(null, " e o seu troco é R$"+(pag-2.5));
		
			
			
			
}
}
}
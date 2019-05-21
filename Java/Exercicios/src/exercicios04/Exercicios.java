package exercicios04;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		String nome = (JOptionPane.showInputDialog(null, "Nome do Produto?"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Produto?"));
		String forma = (JOptionPane.showInputDialog(null, "Forma de pagamento?"));
		
		if((valor > 500) && (forma.equals("a vista"))) {
			//System.out.println("Em pagamento a vista, desconto de 10% "+forma+valor*0.9);
			valor = valor * 0.9;
		}
			
			String mensagem = "Nome: "+nome;
			       mensagem+= "\nValo: "+valor;
			       mensagem+= "\nForma de Pagamento: "+forma;
			       
		JOptionPane.showMessageDialog(null, mensagem);
			
		 
	
	}
		
}
		

	



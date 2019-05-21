package exercicios03;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		Object[] pdd = {"Informar pedido", "Finalizar pedido"};
		Object[] cdg = {"1", "2", "3", "4", "5", "6", "7"};
		
		int pdd1 = 0, cdg1, qnt;
		double han = 0, san = 0, dia = 0, piz = 0, las = 0, pao = 0, bol = 0, total = 0 , pgm = 0, result = 0;
		pdd1 = JOptionPane.showOptionDialog(null,"Selecione uma das opções","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null, pdd,pdd[0]);
		while(pdd1 != 1) {
		pdd1++;
		  
			cdg1 = JOptionPane.showOptionDialog(null,"Informe o codigo","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null, cdg,cdg[0]);
			qnt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade pedida"));
		
			pdd1 = JOptionPane.showOptionDialog(null,"Selecione uma das opções","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null, pdd,pdd[0]);

					  if(cdg1 == 0) {
	    		  han = 5*qnt;
	    		}else if(cdg1 == 1) {
	    		  san = 4.5*qnt;
	    		}else if(cdg1 == 2) {
				  dia = 8*qnt;
	    		}else if(cdg1 == 3) {
				  piz = 12*qnt;
	    		}else if(cdg1 == 4) {
				  las = 16.5*qnt;
	    		}else if(cdg1 == 5) {
				  pao = 1*qnt;
	    		}else if(cdg1 == 6) {
				  bol = 2.5*qnt;
				  
  }	
				total = (han+san+dia+piz+las+pao+bol);
				pgm = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago"));
				result = total - pgm;
 }
	JOptionPane.showMessageDialog(null, result);
}
	
}
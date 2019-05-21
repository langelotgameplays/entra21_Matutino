package exercicios03;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
	
		Object[] codigo = {"Códigos dos Pedidos", "Finalizar"};
		Object[] pedidos = {"1", "2", "3", "4", "5", "6", "7",};
	    
		int quant1, pedidos1, codigo1 = 0;
		double han, san, dia, piz, las, pao, bol;
	    while(!codigo.equals(codigo1 != 1 )) {
		codigo1++;
	    	
			codigo1 = JOptionPane.showOptionDialog(null,"Selecione a Opção","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,codigo,codigo[0]);
	    	pedidos1 = JOptionPane.showOptionDialog(null,"Selecione o Pedido","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,pedidos,pedidos[0]);
	    	quant1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do pedido"));
	
	    			  if(pedidos1 == 0) {
	    		  han = 5.0*quant1;
	    		}else if(pedidos1 == 1) {
	    		  san = 4.5*quant1;
	    		}else if(pedidos1 == 2) {
  				  dia = 8.0*quant1;
	    		}else if(pedidos1 == 3) {
  				  piz = 12.0*quant1;
	    		}else if(pedidos1 == 4) {
  				  las = 16.5*quant1;
	    		}else if(pedidos1 == 5) {
  				  pao = 1.0*quant1;
	    		}else if(pedidos1 == 6) {
  				  bol = 2.5*quant1;
		
	    
}

}

JOptionPane.showMessageDialog(null, "O valor total do pedido foi");	    
	    
}
	
}
package exercicios01;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		short maIda=0, meIda=0, sMas=0, sFem=0, cGer= 0, cAte=0, cAço=0, cSec=0, cAlm=0, cPad=0, cEst=0;
		Object[] sexo = {"Masculino", "Feminino"};
		Object[] cargo = {"Gerente", "Atendente", "Açougueiro",  "Secretária","Almoxarife", "Padeiro", "Estagiário"};
		
		  int variavel = 1;
		while(variavel <= 2) {
			  variavel++;
			  
			  int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			  		if(idade >= 18) {
				  maIda++;
			  }else {
				  meIda++;
			  }
			  
			  int sexo1 = JOptionPane.showOptionDialog(null,"Informe seu sexo","Sexo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo,sexo[0]);
			  		if(sexo1 == 0) {
				  sMas++;
			  }else 
				  sFem++;
				  
			  int cargo1 = JOptionPane.showOptionDialog(null,"Informe seu sexo","Sexo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cargo,cargo[0]);
			  		if(cargo1 == 0) {
				  cGer++;
			  }else if(cargo1 == 1) {
				  cAte++;
			  }else if(cargo1 == 2) {
				  cAço++;
			  }else if(cargo1 == 3) {
				  cSec++;
			  }else if(cargo1 == 4) {
				  cAlm++;
			  }else if(cargo1 == 5) {
				  cPad++;
			  }else if(cargo1 == 6) {
				  cEst++;
				  
   }
			  		
  }
		
		JOptionPane.showMessageDialog(null,"\nMaior de Idade: "+maIda+"\nMenor de Idade: "+meIda+"\nSexo Masculino: "+sMas+"\nSexo Feminino: "+sFem+
		"\nGerente: "+cGer+"\nAtendente: "+cAte+"\nAçogueiro: "+cAço+"\nSecretária: "+cSec+"\nAlmoxarife: "+cAlm+"\nPadeiro: "+cPad+"\nEstagiário: "+cEst);	
		
 }
	
}	
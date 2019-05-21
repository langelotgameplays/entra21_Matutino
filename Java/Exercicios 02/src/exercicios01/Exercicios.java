package exercicios01;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		short idama=0, idame=0, smas=0, sfem=0, cGer= 0, cAte=0, cAço=0, cSec=0, cAlm=0, cPad=0, cEst=0;
		Object[] sexo1 = {"Masculino", "Feminino"};
		Object[] cargo1 = {"Gerente", "Atendente", "Açougueiro",  "Secretária","Almoxarife", "Padeiro", "Estagiário"};
		
		  int idade, variavel = 1;
		while(variavel <= 2) {
			  variavel++;
		
			 idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma Idade"));
				if(idade >= 18) {
				   idade = idama++;
		  }else {
				   idade = idame++;
		  }
			  
			   /*idade = JOptionPane.showOptionDialog(null,"Informe sua idade","Idade",
		           JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,idade1,idade1[0]);
		
			  if(idade == 0) {
				  idama++;
			  }else {
				  idame++;
			  }*/
	
		int sexo = JOptionPane.showOptionDialog(null,"Informe seu sexo",
			"Sexo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo1,sexo1[0]);
		
			  if(sexo == 0) {
			sfem++;
		}else {
			smas++;
		}
		
		int cargo =JOptionPane.showOptionDialog(null,"Informe seu cargo",
			"Cargo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cargo1,cargo1[0]);
			  if(cargo == 0) {
			cGer++;
		}else if(cargo == 1) {
			cAte++;
		}else if(cargo == 2) {
			cAço++;
		}else if(cargo == 3) {
			cSec++;
		}else if(cargo == 4) {
			cAlm++;
		}else if(cargo == 5) {
			cPad++;
		}else if(cargo == 6) {
			cEst++;
			}
			  
		}
		JOptionPane.showMessageDialog(null,"\nMaior de Idade: "+idama+"\nMenor de Idade: "+idame+"\nSexo Masculino: "+smas+
				   "\nSexo Feminino: "+sfem+"\nGerente: "+cGer+"\nAtendente: "+cAte+"\nAçogueiro: "+cAço+
				   "\nSecretária: "+cSec+"\nAlmoxarife: "+cAlm+"\nPadeiro: "+cPad+"\nEstagiário: "+cEst);
	}
}

		

	


			
		
	
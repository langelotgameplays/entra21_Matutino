import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String login, nome;
		int idade, sexo1, dep1, �udioV�deo1, tvs1, AparelhosdeSom1, Informatica1, Hardware1, Software1, Telefonia1, Smartphones1, Tablets1, Vestu�rio1, Masculino1, Feminino1, Pagamento1, aVista=0, aPrazo=0;
		
		Object[] sexo = {"Masculino", "Feminino"};
		Object[] dep = {"�udio/V�deo ", "Inform�tica", "Telefonia", "Vestu�rio"};
		Object[] �udioV�deo = {"TVs", "Aparelhos de Som "};
		Object[] tvs = {"Smart TV Led 49 Samsung - R$ 4.999,99 ", "Smart TV 4k LG 60 - R$7.499,00", "Smart TV Full HD 32 Samsung - R$ 1.710,00"};
		Object[] AparelhosdeSom = {" 1 ", " 2 ", " 3 "};
		Object[] Informatica = {"Hardware", "Software"};
		Object[] Hardware = {"Placa M�e Asus - R$ 2.000,00", "Mem�ria Ram Corsair 4GB - R$500,00", "Mouse Multilaser - R$59,90"};
		Object[] Software = {"Windows 10  - R$500,00", "Office 2019   - R$399,99", "AutoCard 3D - R$899,50"};
		Object[] Telefonia = {"Smartphones", "Tablets"};
		Object[] Smartphones = {" 1 ", " 2 ", " 3 "};
		Object[] Tablets = {" 1 ", " 2 ", " 3 "};
		Object[] Vestu�rio = {"Masculino", "Feminino"};
		Object[] Masculino = {"Camisa Social Lacoste - R$ 200,00", "Cal�a Jeans Calvin Klein R$ 230,00", "Camisa Social Dudalina - R$ 130,00"};
		Object[] Feminino = {"Camisa Social Dudalina - R$170,00", "Cal�a Jeans Miss Masi - R$ 99,90", "Bermuda Dijean - R$ 74,40"};
		Object[] Pagamento = {"A Vista", "A prazo"};
		
			login = (JOptionPane.showInputDialog(null,"Voc� quer utilizar o sistema? sim ou n�o?"));
			nome = (JOptionPane.showInputDialog("Informe seu nome"));
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			sexo1 = JOptionPane.showOptionDialog(null,"Selecione o seu sexo","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo,sexo[0]);
			
			while (!login.equalsIgnoreCase("n�o")){
				dep1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,dep,dep[0]);
		
					if(dep1 == 0) {
						�udioV�deo1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,�udioV�deo,�udioV�deo[0]);
							if(�udioV�deo1 == 0) {
								tvs1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,tvs,tvs[0]);
								
			  }else if(dep1 == 0) {
				  		    if(�udioV�deo1 == 1) {
				  				AparelhosdeSom1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,AparelhosdeSom,AparelhosdeSom[0]);
							}
							
		
					if(dep1 == 1) {
						 Informatica1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null, Informatica,Informatica[0]);
									if(Informatica1 == 0) {
											Hardware1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Hardware,Hardware[0]);
							
			  }else if(dep1 == 1) {
					  		    	if(�udioV�deo1 == 1) {
					  		    			Software1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Software,Software[0]);
					  		 }
					  
					  if(dep1 == 2) {
						  Telefonia1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Telefonia,Telefonia[0]);
									if(Telefonia1 == 0) {
										Smartphones1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,tvs,tvs[0]);
												
							  }else if(dep1 == 0) {
								    if(Telefonia1 == 1) {
								    	Tablets1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,AparelhosdeSom,AparelhosdeSom[0]);
							 }
		
						if(dep1 == 3) {
							Vestu�rio1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Vestu�rio,Vestu�rio[0]);
									if(Telefonia1 == 0) {
										 Masculino1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Masculino,Masculino[0]);
																
								}else if(dep1 == 0) {
									 if(Telefonia1 == 1) {
										 Feminino1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Feminino,Feminino[0]);
											 }	
					  		    	
									 
						Pagamento1 = JOptionPane.showOptionDialog(null,"Selecione uma das Op��es abaixo:","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,Pagamento,Pagamento[0]);		 
									 if(Pagamento1 == 0)
										 aVista++;
								}else {
										 aPrazo++;
									 
		
		login = (JOptionPane.showInputDialog(null,"Voc� quer utilizar o sistema? sim ou n�o?"));
}		
}
}
}
}
}	
}
}
}
}
}
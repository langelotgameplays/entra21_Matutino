package exercicios06;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		
		String nome;
		short sFem=0, sMas=0, me10=0, me9=0, me8=0, me7=0, me5=0, me0=0;
		Object[] sexo1 = {"Masculino", "Feminino"};
		int sexo, variavel = 1;
		while(variavel <= 2) {
			  variavel++;
			  
			  nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
			  while (!nome.equalsIgnoreCase("sair")){ 
			  		   sexo = JOptionPane.showOptionDialog(null,"Informe seu sexo",
						"Sexo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo1,sexo1[0]);
					
						   if(sexo == 0) {
						 sMas++;
					 }else {
						 sFem++;
					 }
						   
					double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota"));
					double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota"));
					double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota"));
					double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota"));
					double media = (nota1+nota2+nota3+nota4)/4;
					
					      if(media == 10) {
						me10++;
					}else if(media >= 9) {
						me9++;
					}else if(media >= 8) {
						me8++;
					}else if(media >= 7) {
						me7++;
					}else if(media >= 5) {
						me5++;
					}else if(media < 5) {
						me0++;
					}else {
					 	  
						
		
						nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
			  
		
					}
		
	
		}
	
		double pMas = (100/(sMas+sFem)/sMas);
		double pFem = (100/(sMas+sFem)/sFem); 
		double p10 = (100/(sMas+sFem)/me10); 
		double p9 = (100/(sMas+sFem)/me9);
		double p8 = (100/(sMas+sFem)/me8); 
		double p7 = (100/(sMas+sFem)/me7); 
		double p5 = (100/(sMas+sFem)/me5); 
		double p0 = (100/(sMas+sFem)/me0); 
		
		JOptionPane.showMessageDialog(null, "Alunos:\nSexo Masculino: "+sMas+"   "+pMas+"%"+"\nSexo Feminino: "+sFem+"\nNotas:\nalunos que tiraram media 10:"
			+me10+"   "+p10+"Parabéns"+"\nalunos que tiraram a media entre 9 e 9.9: "+me9+" Ótimo"+"\nalunos que tiraram a media entre 8 e 8.9: "+me8+"Bom"+
			"\nalunos que tiraram a media entre 7 e 7.9: "+me7+" Satisfatório"+"\nalunos que tiraram entre 5 e 6.9:"+me5+
			"\nalunos que tiraram a media abaixo de 5:"+me0+"Reprovado");

	}
	
}
}	

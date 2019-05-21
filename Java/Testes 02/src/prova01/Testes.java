package prova01;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		int sMas=0, sFem=0, cFidelidade1=0;
		String nome, mNome=" ";
		double horas=0, horas50=0, horas100=0, idade=0, faltas=0, qntFilhos=0, salarioBruto=0, salarioLiquido=0, inss=0, passe=0, faltas0=0, idade1=0, idade2=0, idade3=0, idade4=0, qntFuncionarios=0, pMas=0, pFem=0,
			   c0=0, c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, vHoras=0, MsalarioLiquido=0, pFidelidade=0;
		Object[] cargo = {"Desenv. Java Júnior", "Desenv. Java Pleno", "Desenv.r Java Sênior", "Adm. de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
		Object[] sexo = {"Masculino", "Feminino"};
		Object[] cFidelidade = {"Sim", "Não"};
		
		nome = (JOptionPane.showInputDialog("Informe o seu nome, ou digite sair"));
		while (!nome.equalsIgnoreCase("sair")){
		int cargo1 = JOptionPane.showOptionDialog(null,"Selecione um dos cargos","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cargo,cargo[0]);
		vHoras = Double.parseDouble(JOptionPane.showInputDialog("Informe o quanto você ganha por hora"));
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas"));
		horas50 = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas 50%"));
		horas100 = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas 100%"));
		int sexo1 = JOptionPane.showOptionDialog(null,"Selecione o seu sexo","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo,sexo[0]);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas faltas você tem?"));
		qntFilhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem?"));
		cFidelidade1 = JOptionPane.showOptionDialog(null,"Você é associado ao clube fidelidade","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cFidelidade,cFidelidade[0]);
	
		salarioBruto = (horas*vHoras) + (horas50*vHoras*1.50) + (horas100*vHoras*2);
		if(salarioBruto <= 2000) {
			inss = salarioBruto*0.05;
		}else if(salarioBruto <= 3500) {
			inss = salarioBruto*0.07;
		}else if(salarioBruto <= 5600) {
			inss = salarioBruto*0.08;
		}else if(salarioBruto > 5600) {
			inss = salarioBruto*0.10;
		}else  {
		}
		passe = salarioBruto*0.06;
		
		if(faltas == 0) {
			faltas0 = 200;
		}else {
			faltas0 = 0;	
		}
		qntFilhos *= 50;
		
 		if(cFidelidade1 == 0) {
			salarioBruto -= 110;
			cFidelidade1++;
		}else {
			salarioBruto -= 0;
		}
	
		salarioLiquido = (salarioBruto - inss - passe) + faltas0 + qntFilhos;
		
			if(salarioLiquido > MsalarioLiquido) {
				MsalarioLiquido = salarioLiquido;
				mNome = nome;
		}
			if(idade < 26) {
				idade1++;
			}else if(idade < 41) {
				idade2++;
			}else if(idade < 51) {
				idade3++;
			}else {
				idade4++;
			}
		
			if(sexo1 == 0) {
				sMas++;
			}else {
				sFem++;
			}
			
		
		
				if(cargo1 == 0) {
					c0++;
				}else if(cargo1 == 0) {
					c1++;
				}else if(cargo1 == 1) {
					c2++;
				}else if(cargo1 == 2) {
					c3++;
				}else if(cargo1 == 3) {
					c4++;
				}else if(cargo1 == 4) {
					c5++;
				}else if(cargo1 == 5) {
					c6++;
				}else if(cargo1 == 6) {
					c7++;
				}else if(cargo1 == 7) {
					c8++;
				}else {
					
				}
	    qntFuncionarios++;
	   
		nome = (JOptionPane.showInputDialog("Informe o seu nome, ou digite sair"));
  }
		pMas = (sMas/qntFuncionarios)*100;
		pFem = (sFem/qntFuncionarios)*100;
		pFidelidade = (cFidelidade1/qntFuncionarios)*100;
		
	JOptionPane.showMessageDialog(null, "Qunatidade de funcionarios cadastrados = "+qntFuncionarios+"\nQuantidade de Homens = "+sMas+" "+pMas+"%"+
			"\nQuantidade de Mulheres = "+sFem+" "+pFem+"%"+"\nNumero de funcionarios entre 18 a 26 anos = "+idade1+"\nNumero de funcionarios entre 27 a 40 anos = "+idade2+
			"\nNumero de funcionarios entre 41 a 50 anos = "+idade3+"\nNumero de funcionarios acima de 50 anos = "+idade4+"\nDesenv. Java Júnior = "+c0+" "+(c0/qntFuncionarios)*100+"%"
			+"\nDesenv. Java Pleno = "+c1+" "+(c1/qntFuncionarios)*100+"%"+"\nDesenv. Java Sênior = "+c2+" "+(c2/qntFuncionarios)*100+"%"+"\nAdm. de Banco de Dados = "+c3+" "+(c3/qntFuncionarios)*100+"%"
			+"\nAnalista Júnior = "+c4+" "+(c4/qntFuncionarios)*100+"%"+"\nAnalista Pleno = "+c5+" "+(c5/qntFuncionarios)*100+"%"+"\nAnalista Sênior = "+c6+" "+(c6/qntFuncionarios)*100+"%"
			+"\nArquiteto de Software = "+c7+" "+(c7/qntFuncionarios)*100+"%"+"\nGerente de Projetos = "+c8+" "+(c8/qntFuncionarios)*100+"%"+"\nFuncionario com maior salario liquido: "+mNome+
			" com salario de ="+MsalarioLiquido+"\nAssociados ao Clube:"+cFidelidade1+" "+pFidelidade+"%");	
		
 }

}

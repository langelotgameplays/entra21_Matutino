package prova01;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		String nome;
		double horas=0, horas50=0, horas100=0, idade=0, faltas=0, qntFilhos=0, salarioBruto=0, salarioLiquido=0, inss=0, passe=0, faltas0=0, idade1=0, idade2=0, idade3=0, idade4=0, qntFuncionarios=0;
		Object[] cargo = {"Desenvolvedor Java Júnior", "Desenvolvedor Java Pleno", "Desenvolvedor Java Sênior", "Administrador de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
		Object[] sexo = {"Masculino", "Feminino"};
		Object[] cFidelidade = {"Sim", "Não"};
		
		nome = (JOptionPane.showInputDialog("Informe o seu nome, ou digite sair"));
		while (!nome.equalsIgnoreCase("sair")){
		int cargo1 = JOptionPane.showOptionDialog(null,"Selecione um dos cargos","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cargo,cargo[0]);
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas"));
		horas50 = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas 50%"));
		horas100 = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas 100%"));
		int sexo1 = JOptionPane.showOptionDialog(null,"Selecione o seu sexo","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,sexo,sexo[0]);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas faltas você tem?"));
		qntFilhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem?"));
		int cFidelidade1 = JOptionPane.showOptionDialog(null,"Você é associado ao clube fidelidade","Sistema",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,cFidelidade,cFidelidade[0]);
	
		salarioBruto = (horas*10) + (horas50*15) + (horas100*20);
		if(salarioBruto <= 2000) {
			inss = salarioBruto*0.95;
		}else if(salarioBruto <= 3500) {
			inss = salarioBruto*0.93;
		}else if(salarioBruto <= 5600) {
			inss = salarioBruto*0.92;
		}else if(salarioBruto > 5600) {
			inss = salarioBruto*0.90;
		}else  {
		}
		inss *= 0.94;
		
		if(faltas == 0) {
			faltas0 = 200;
		}else {
			faltas0 = 0;
		}
		qntFilhos *= 50;
		
 /*		if(cFlidelidade == 0) {
			salarioBruto -= 110;
		}else {
			salarioBruto -= 0;
		}
	*/
		salarioLiquido = salarioBruto + faltas + qntFilhos - inss; //- cFidelidade;
		
		if(idade >= 18) {
			idade = idade1;
		}else if(idade > 26) {
			idade = idade2;
		}else if(idade > 40) {
			idade = idade3;
		}else if(idade > 50) {
			idade = idade4;
		}else {
		}
		
		
		
	    qntFuncionarios++;
		nome = (JOptionPane.showInputDialog("Informe o seu nome, ou digite sair"));
  }
		
 }

}

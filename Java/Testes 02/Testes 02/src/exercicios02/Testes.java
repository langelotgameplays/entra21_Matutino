package exercicios02;

import javax.swing.JOptionPane;  

public class Testes {

	public static void main(String[] args) {
		
		String nome;  
        double altura=0, peso=0, mJog=0, mPes=0, altAcu=0, soma=0;  
        int idade=0, qntJog=0, mVel=0;  
  
        nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
          
        while (!nome.equalsIgnoreCase("sair")){  
            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso")); 
  
  
            if (peso > mPes) {  
            	mPes = peso;
            	
            }  
            if (altura > mJog) {  
            	mJog = altura; 
            	
            }  
            if (idade > mVel) {  
            	mVel = idade;
            	
            }  
            altAcu += altura;  
            qntJog++;  
            nome = JOptionPane.showInputDialog("Para continuar insira seu nome, ou digite sair");
            }  
  
        soma = altAcu / qntJog;  
  
        JOptionPane.showMessageDialog(null,"Quantidade de jogadores cadastrados: "+qntJog+"\nJogador mais alto:"+mJog+
        	 "\nJogador mais velho: "+ mVel+"\nJogador mais pesado: "+mPes+"\nMédia das alturas dos jogadores: "+soma);
        
 }
	
}

package exemplo12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um Objeto para armazenar os dados
		Scanner armazenar = new Scanner(System.in);
		
		//Realiz uma pergunta
		System.out.println("Qual � o seu nome?");
		
		//Obter o nome
		String nome = armazenar.nextLine();
		
		//Exibir o nome informado
		System.out.println("O nome informado � "+nome);

	}

}

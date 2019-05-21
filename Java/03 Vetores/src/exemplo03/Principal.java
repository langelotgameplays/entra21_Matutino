package exemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor de numeros
		int[] numeros = new int[10];
		
		//Scanner
		Scanner obterNumeros = new Scanner(System.in);
		
		//Laço for
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Informe o "+(indice+1)+"º numero");
			numeros[indice] = obterNumeros.nextInt();
		}
		
		//Finalizar Scanner
		obterNumeros.close();
		
		//Listar os valores FOREACH
		for(int n : numeros) {
			System.out.println(n);	
		}
		
		

	}

}

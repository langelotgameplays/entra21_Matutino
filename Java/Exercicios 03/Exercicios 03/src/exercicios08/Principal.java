package exercicios08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double soma = 0, media = 0;
		int numerosPar = 0, numerosImpar = 0, qntMaMedia = 0;
		int[][] matriz = new int[5][6];

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[0].length; coluna++) {

				matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(linha + " " + coluna));
				if (matriz[linha][coluna] % 2 == 0) {
					numerosPar++;
				} else {
					numerosImpar++;
				}
				soma += (matriz[linha][coluna]);
			}

		}
		media = soma / 30;

		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 6; coluna++) {

				if (matriz[linha][coluna] >= media) {
					qntMaMedia++;
				} else {
				}

			}

		}
		
		System.out.println("Dados"+"\nQuantidade de numeros par: " + numerosPar+"\nQuantidade de numeros Impar: " + numerosImpar+
				"\nMédia dos numeros Informados: " + media+"\nQuantidade de numeros acima da media: " + qntMaMedia+"\n");

		System.out.println("Matriz:");
		for (int linha = 0; linha < 5; linha++) {

			System.out.println("\n");

			for (int coluna = 0; coluna < 6; coluna++) {

				System.out.print(matriz[linha][coluna] + " ");
			}

		}

	}
}
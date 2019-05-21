package exemplo05;

public class Principla {

	public static void main(String[] args) {
		
		//Vetor contendo numeros inteiros
		int[] numeros = {3, 1, 5, 2, 4};
		
		//Método de ordenação - Bubble Sort | Método bolha
		int maiorNumero;
		for(int i1 = 0; i1 < 4; i1++) {
			
			for(int i2 = i1+1; i2 < 5; i2++) {
				
				if(numeros[i2] < numeros[i1]) {
					maiorNumero = numeros[i1];
					numeros[i1] = numeros[i2];
					numeros[i2] = maiorNumero;
				}
				
			}
			
		}
		//Arrays.sort(numeros);
		
		//Exibir os dados do vetor
		for(int n : numeros) {
			System.out.println(n);
		}
		
	}

}

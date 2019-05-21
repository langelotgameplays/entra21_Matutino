package pacote;

public class Texte {
	
	//Atributo
	private String palavra;
	
	//Construtor
	public Texte(String palavra) {
		this.palavra = palavra;
	}

	//Método para contar caracteres
	public void contarLetras() {
		System.out.println("A palavra "+palavra.toLowerCase()+" possui "+palavra.length()+" letras. ");
	}
	
}

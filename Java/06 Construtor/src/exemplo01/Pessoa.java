package exemplo01;

public class Pessoa {

	// Construtor #1
	Pessoa() {

		System.out.println("Ol�");
	}

	// Construtor #2
	Pessoa(String nome) {
		System.out.println("Ol� " + nome);
	}

	// Construtor #2
	Pessoa(String nome, int idade) {
		System.out.println("Ol� " + nome + ", voc� tem " + idade + " anos");
	}

}

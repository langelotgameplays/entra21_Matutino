package exemplo02;

public class Principal {

	public static void main(String[] args) {

		// Inst�ncia
		Calculadora c = new Calculadora();
		c.somar(5, 10);

		int resultadoSubtracao = c.subtracao(20, 8);
		System.out.println("A subtra��o � " + resultadoSubtracao);

	}

}

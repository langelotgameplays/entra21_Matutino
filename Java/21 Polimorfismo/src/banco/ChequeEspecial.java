package banco;

public class ChequeEspecial extends Cheque{

	// Método de Juros
	public void juros(double valor) {
		System.out.println("Taxa do cheque Especial: " + valor * 0.20);
		
		
	}
	public void mensagem() {
		System.out.println("Você reescreveu o método mensagem");
	}
}

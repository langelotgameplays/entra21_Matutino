package banco;

public class ChequeEspecial extends Cheque{

	// M�todo de Juros
	public void juros(double valor) {
		System.out.println("Taxa do cheque Especial: " + valor * 0.20);
		
		
	}
	public void mensagem() {
		System.out.println("Voc� reescreveu o m�todo mensagem");
	}
}

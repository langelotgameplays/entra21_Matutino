package cargos;

public class Estagiario extends Cargo {

	//Construtor
	public Estagiario() {
		cargo = "Estagi�rio";
	}
	
	// IR
	public void ir() {
		System.out.println("N�o h� desconto de imposto de renda");
	}

}

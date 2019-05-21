package cargos;

public class Analista extends Cargo{

	//Construtor
	public Analista(double salario, int nivel) {
		cargo = "Analista";
		this.salario = salario;
		this.nivel = nivel;
	}
	
	// IR
	public void ir() {
		
		if(nivel == 1) {
			System.out.println("Imposto de renda: " + salario * 0.15);
		}else {
			System.out.println("Imposto de renda: " + salario * 0.20);
		}

	}

}

package cargos;

public class Cargo {
	
	//Atributos
	protected String cargo;
	protected double salario;
	protected int nivel;
	
	//Vale Transporte
	public void vt() {
		
		System.out.println("Desconto do vale transporte � "+salario*0.06);
		
	}

	//Indentifica��o
	public void indentifica��o() {
		System.out.println("O cargo selecionado � "+cargo);
	}
}

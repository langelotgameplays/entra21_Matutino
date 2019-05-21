package principal;

import cargos.Analista;
import cargos.Desenvolveldor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000, 2);
		Desenvolveldor d = new Desenvolveldor(3000, 3);
		
		//Chamando os m�todos de indentifica��o
		e.indentifica��o();
		a.indentifica��o();
		d.indentifica��o();
		
		//Chamando os m�todos de vale tranporte
		e.vt();
		a.vt();
		d.vt();
		
		//Chamando os m�todos IR
		e.ir();
		a.ir();
		d.ir();
	
		
		

	}

}

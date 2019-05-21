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
		
		//Chamando os métodos de indentificação
		e.indentificação();
		a.indentificação();
		d.indentificação();
		
		//Chamando os métodos de vale tranporte
		e.vt();
		a.vt();
		d.vt();
		
		//Chamando os métodos IR
		e.ir();
		a.ir();
		d.ir();
	
		
		

	}

}

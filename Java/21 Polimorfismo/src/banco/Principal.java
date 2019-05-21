package banco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		//Poli    -> Varios
		//Morphus -> Formas
		
		Cheque obj1 = new Cheque();
		obj1.juros(1000);
		obj1.mensagem();
		
		Cheque obj2 = new ChequeEspecial();
		obj2.juros(1000);
		obj2.mensagem();
		
		//Outro exemplo
		List<String> nomes = new ArrayList<String>();
		List<String> emails = new LinkedList<String>();
		
		
	}

}

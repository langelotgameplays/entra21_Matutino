package estado;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {

		// Criar o HashMap
		HashMap<String, String> estados = new HashMap<String, String>();

		// Adicionar
		estados.put("Santa Catarina", "Florian�polis");
		estados.put("Paran�", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		estados.put("Rio Grande do Sul", "Porto Alegre");

		// Exibir informa��o especifica
		System.out.println(estados.get("Paran�"));

		//Remover uma informa��o
		estados.remove("Paran�");
		
		//Remover todos os conteudos
		estados.clear();
		
		// Listar todos os valores
		System.out.println(estados);

	}

}

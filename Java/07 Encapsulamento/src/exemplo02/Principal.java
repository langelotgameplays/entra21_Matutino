package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Angelo");
		p.setIndade(19);
		
		System.out.println("Seu nome é "+p.getNome()+"\nSua idade é "+p.getIndade());

	}

}

package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Angelo");
		p.setIndade(19);
		
		System.out.println("Seu nome � "+p.getNome()+"\nSua idade � "+p.getIndade());

	}

}

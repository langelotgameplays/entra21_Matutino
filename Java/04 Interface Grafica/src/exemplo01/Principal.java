package exemplo01;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);
		formulario.setTitle("Meu primeiro Formulário");
		formulario.setLocationRelativeTo(null);

	}

}

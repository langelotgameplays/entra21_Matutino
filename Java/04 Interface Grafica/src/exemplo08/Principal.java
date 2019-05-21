package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		// Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu oitavo Formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		//TextArea
		JTextArea campo = new JTextArea();
				
		//Scroll
		JScrollPane barra = new JScrollPane(campo);
		barra.setBounds(10, 10, 470, 230);
		
		//Adicionae elementos
		formulario.add(barra);
		
		// Exibir formulario e componentes
		formulario.setVisible(true);

	}

}

package exemplo04;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um formulario
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu terceiro Formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Caixa de combina��o
		JComboBox<String> combo = new JComboBox<String>();
		combo.setBounds(10, 10, 470, 30);
		combo.addItem("Op��o 01");
		combo.addItem("Op��o 02");
		combo.addItem("Op��o 03");
		
		//Adicionar combo ao formulario
		formulario.add(combo);
		
		//Exibir formulario e componentes
		formulario.setVisible(true);
	}

}

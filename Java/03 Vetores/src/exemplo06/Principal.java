package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Matriz ou Array Bidimensional
		String[][] cursos = new String[2][2];
		
		//Obter informa��es dos cursos
		for(int i=0; i<2; i++) {
			cursos[i][0] = JOptionPane.showInputDialog("Nome do curso");
			cursos[i][1] = JOptionPane.showInputDialog("�rea de atua��o");
		}
		
		//Exibir informa��es
		System.out.println("Cursos: "+cursos[0][0]+" - �rea: "+cursos[0][1]);
		System.out.println("Cursos: "+cursos[1][0]+" - �rea: "+cursos[1][1]);
		
	}

}

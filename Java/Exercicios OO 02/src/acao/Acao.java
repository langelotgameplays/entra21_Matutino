package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import dados.Dados;

public class Acao {

	// Cadastrar
	public void cadastrar(Jogo j) {
		Dados.arrayJogos.add(j);

	}

	// Sele��o
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Genero");
		modelo.addColumn("Plataforma");
		modelo.addColumn("Classifica��o Indicativa");
		modelo.addColumn("Valor");

		for (int indice = 0; indice < Dados.arrayJogos.size(); indice++) {
			modelo.addRow(new Object[] { Dados.arrayJogos.get(indice).getNomeJogo(),
					Dados.arrayJogos.get(indice).getGenero(), Dados.arrayJogos.get(indice).getPlataforma(),
					Dados.arrayJogos.get(indice).getcIndicativa(), Dados.arrayJogos.get(indice).getValor(),

			});

		}

		return modelo;
	}

	// Altera��o
	public void alterar(int indice, Jogo j) {

		Dados.arrayJogos.set(indice, j);

	}

	// Exclus�o
	public void excluir(int indice) {

		Dados.arrayJogos.remove(indice);

	}

}

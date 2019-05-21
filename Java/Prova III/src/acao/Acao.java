package acao;

import javax.swing.table.DefaultTableModel;

import beans.Beans;
import dados.Dados;

public class Acao {

	// Cadastrar
	public void cadastrar(Beans b) {
		Dados.arrayDados.add(b);
	}

	// Selecionar
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Altura");
		modelo.addColumn("Peso");
		modelo.addColumn("IMC");

		for (int i = 0; i < Dados.arrayDados.size(); i++) {
			modelo.addRow(new Object[] { Dados.arrayDados.get(i).getNome(), Dados.arrayDados.get(i).getIdade(),
					Dados.arrayDados.get(i).getAltura(), Dados.arrayDados.get(i).getPeso(),
					Dados.arrayDados.get(i).getImc(),

			});

		}
		return modelo;
	}

	// Alterar
	public void alterar(int indice, Beans b) {
		Dados.arrayDados.set(indice, b);
	}

	// Excluir
	public void excluir(int indice) {
		Dados.arrayDados.remove(indice);
	}

}


package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

public class Formulario {

	// ArrayList de pessoas
	public static ArrayList<Pessoa> dadosPessoa = new ArrayList<Pessoa>();

	//DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
	// Construror
	public Formulario() {
		JFrame f = new JFrame("Sistema Simples");
		f.setSize(335, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(cadastrarDados());
		f.add(listarDados());
		f.setVisible(true);
	}

	// Cadastrar dados
	private JPanel cadastrarDados() {

		JPanel p = new JPanel();
		p.setBounds(10, 10, 300, 200);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 10, 60, 20);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 50, 60, 20);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 90, 60, 20);

		JTextField txtNome = new JTextField();
		txtNome.setBounds(70, 10, 220, 20);

		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(70, 50, 220, 20);

		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(70, 90, 220, 20);

		JButton btnCadastrar = new JButton("Casdastrar");
		btnCadastrar.setBounds(80, 120, 150, 20);

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Obter os dados Informados
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();

				// Criar um obj da Classe Pessoa
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);

				// Adicionar ao ArrayList
				dadosPessoa.add(p);

				//Adicionar dados na Tabela
				dados.addRow(new Object[] {nome, idade,cidade});
				
				// Limpar os Campos
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");

				// Cursos no campo nome selecionado
				txtNome.requestFocus();

			}
		});

		p.add(lblNome);
		p.add(lblIdade);
		p.add(lblCidade);
		p.add(txtNome);
		p.add(txtIdade);
		p.add(txtCidade);
		p.add(btnCadastrar);

		return p;

	}

	// Listar dados
	private JPanel listarDados() {

		JPanel p = new JPanel();
		p.setBounds(10, 240, 300, 200);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);

		JScrollPane barra = new JScrollPane(tabela());
		barra.setBounds(0, 0, 300, 200);

		p.add(barra);

		return p;

	}

	// Tabela
	private JTable tabela() {

		// Dados d20 d12 d10 d8 d6 d4 d3
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Cidade");
		dados.addRow(new Object[] { "Carlos", 46, "Blumenau" });
		dados.addRow(new Object[] { "Bianca", 22, "Pomerode" });
		dados.addRow(new Object[] { "Let�cia", 29, "Joinville" });

		// Tabela
		JTable tabela = new JTable(dados);

		// Retorno
		return tabela;

	}
}

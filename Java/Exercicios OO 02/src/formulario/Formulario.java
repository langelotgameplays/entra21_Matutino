package formulario;

import javax.swing.JFrame;
import acao.Acao;
import beans.Jogo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Formulario extends JFrame {
	private JTextField txtNome;
	private JTextField txtValor;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private static int codigoJogo;

	private void limparCampos() {

		// Limpar os campos
		txtNome.setText("");
		txtValor.setText("");

		// Focus
		txtNome.requestFocus();

	}

	// Frame
	public Formulario() {

		// Objeto da class Acao
		Acao a = new Acao();

		// Informações do Formulario
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 525);
		getContentPane().setLayout(null);

		// JLabel
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(10, 11, 180, 30);
		getContentPane().add(lblNome);

		JLabel lblGenero = new JLabel("Gênero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGenero.setBounds(10, 73, 180, 30);
		getContentPane().add(lblGenero);

		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlataforma.setBounds(10, 135, 180, 30);
		getContentPane().add(lblPlataforma);

		JLabel lblClassificaoIndicativa = new JLabel("Classificação Indicativa");
		lblClassificaoIndicativa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblClassificaoIndicativa.setBounds(10, 197, 180, 30);
		getContentPane().add(lblClassificaoIndicativa);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(10, 259, 180, 30);
		getContentPane().add(lblValor);

		// JTextField
		txtNome = new JTextField();
		txtNome.setBounds(10, 42, 180, 30);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtValor = new JTextField();
		txtValor.setBounds(10, 290, 180, 30);
		getContentPane().add(txtValor);
		txtValor.setColumns(10);

		// Criação dos Botões
		JButton bntCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setEnabled(false);

		// JButton Cadastrar
		bntCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bntCadastrar.setBounds(10, 331, 180, 30);
		getContentPane().add(bntCadastrar);
		bntCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// Criar um objeto jogo
				Jogo j = new Jogo();
				j.setNomeJogo(txtNome.getText());
				j.setValor(txtValor.getText());

				// Efetuar cadastro
				a.cadastrar(j);

				// Atualizar tabela
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

				bntCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});

		// JButton Alterar
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(10, 372, 180, 30);
		getContentPane().add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// Instânciar um objeto da classe curso
				Jogo j = new Jogo();
				j.setNomeJogo(txtNome.getText());
				j.setValor(txtValor.getText());

				// Alterar Informações
				a.alterar(codigoJogo, j);

				// Atualizar tabela
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

				bntCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});

		// JButton Excluir
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(10, 413, 180, 30);
		getContentPane().add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// Remover o curso
				a.excluir(codigoJogo);

				// Atualizar lista de cursos
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

				// Botões
				bntCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});

		// JButton Cancelar
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(10, 454, 180, 30);
		getContentPane().add(btnCancelar);
		bntCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// Limpar campos
				limparCampos();

				// Botões
				bntCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});

		// Informações Principais
		JScrollPane scrollPanePrincipal = new JScrollPane();
		scrollPanePrincipal.setBounds(200, 11, 384, 309);
		getContentPane().add(scrollPanePrincipal);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent e) {

				// Obter o indice da tabela
				int indice = table.getSelectedRow();

				// Obter o valor do indice no atributo
				codigoJogo = indice;

				// Selecionando dados do Curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtValor.setText(table.getValueAt(indice, 4).toString());

				// Botões
				bntCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
			}

		});
		table.setModel(a.selecionar());
		scrollPanePrincipal.setViewportView(table);

		// Informações Plataforma
		JScrollPane scrollPaneSec1 = new JScrollPane();
		scrollPaneSec1.setBounds(200, 331, 187, 154);
		getContentPane().add(scrollPaneSec1);

		table_1 = new JTable();
		scrollPaneSec1.setViewportView(table_1);

		// Informações Genero
		JScrollPane scrollPaneSec2 = new JScrollPane();
		scrollPaneSec2.setBounds(397, 330, 187, 154);
		getContentPane().add(scrollPaneSec2);

		table_2 = new JTable();
		scrollPaneSec2.setViewportView(table_2);

		JComboBox cbGenero = new JComboBox();
		cbGenero.setBounds(10, 104, 180, 30);
		getContentPane().add(cbGenero);
		cbGenero.addItem("Ação/Aventura");
		cbGenero.addItem("Luta");
		cbGenero.addItem("Tiro/Shoter");
		cbGenero.addItem("Role-Playng Game (RPG)");
		cbGenero.addItem("Construção/Gerenciamento");
		cbGenero.addItem("Vida Virtual");
		cbGenero.addItem("Música/Ritmo");
		cbGenero.addItem("Esportes");
		cbGenero.addItem("Simulação de veículo");

		JComboBox cbPlataforma = new JComboBox();
		cbPlataforma.setBounds(10, 166, 180, 30);
		getContentPane().add(cbPlataforma);
		cbPlataforma.addItem("PSP");

		JComboBox cbCIndicativa = new JComboBox();
		cbCIndicativa.setBounds(10, 228, 180, 30);
		getContentPane().add(cbCIndicativa);
		cbCIndicativa.addItem("Livre");
		cbCIndicativa.addItem("10 anos");
		cbCIndicativa.addItem("12 anos");
		cbCIndicativa.addItem("14 anos");
		cbCIndicativa.addItem("16 anos");
		cbCIndicativa.addItem("18 anos");
		cbCIndicativa.addItem("ER");

	}
}

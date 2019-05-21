package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Curso;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int codigoCurso;

	private void limparCampos() {
		// Limpar os campos
		txtNome.setText("");
		txtArea.setText("");

		// Focus
		txtNome.requestFocus();
	}

	public Formulario() {

		// Objeto da classe acao
		Acao a = new Acao();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 41, 30);
		contentPane.add(lblNome);

		JLabel lblArea = new JLabel("\u00C1rea");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArea.setBounds(10, 52, 41, 30);
		contentPane.add(lblArea);

		txtNome = new JTextField();
		txtNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNome.setBounds(51, 11, 347, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtArea = new JTextField();
		txtArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtArea.setBounds(51, 52, 347, 30);
		contentPane.add(txtArea);
		txtArea.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Criar um objeto curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Efetuar cadastro
				a.cadastrar(c);

				// Atualizar tabela
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

			}
		});
		JButton btnCancelar = new JButton("Cancelar");

		JButton btnExcluir = new JButton("Excluir");

		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.setBounds(10, 93, 90, 30);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Instânciar um objeto da classe curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());

				// Realizar alteração
				a.alterar(codigoCurso, c);

				// Atualizar a listagem
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(109, 93, 90, 30);
		contentPane.add(btnAlterar);

		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Remover o curso
				a.excluir(codigoCurso);

				// Atualizar lista de cursos
				table.setModel(a.selecionar());

				// Limpar campos
				limparCampos();

				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(209, 93, 90, 30);
		contentPane.add(btnExcluir);

		btnCancelar.setEnabled(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Limpar campos
				limparCampos();

				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(309, 93, 90, 30);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 134, 387, 182);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter o indice da tabela
				int indice = table.getSelectedRow();

				// Obter o valor do indice no atributo
				codigoCurso = indice;

				// Selecionando dados do Curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtArea.setText(table.getValueAt(indice, 1).toString());

				// Botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);

			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);
	}
}

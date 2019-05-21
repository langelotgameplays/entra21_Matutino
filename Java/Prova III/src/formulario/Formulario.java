package formulario;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import acao.Acao;
import beans.Beans;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTable table;
	private static int codigoDados;
	private JTextField txtIMC;

	public Formulario() {
		setResizable(false);

		// Método
		Acao a = new Acao();

		// JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(10, 11, 448, 178);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(11, 11, 81, 14);
		panel.add(lblNome);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(236, 11, 81, 14);
		panel.add(lblIdade);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(11, 36, 81, 14);
		panel.add(lblAltura);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(236, 36, 48, 14);
		panel.add(lblPeso);

		JTextField txtNome = new JTextField();
		txtNome.setBounds(69, 8, 157, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);

		JTextField txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(284, 8, 180, 20);
		panel.add(txtIdade);

		JTextField txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(69, 33, 157, 20);
		panel.add(txtAltura);

		txtPeso = new JTextField();
		txtPeso.setBounds(284, 36, 180, 20);
		panel.add(txtPeso);
		txtPeso.setColumns(10);

		// JButton
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnExcluir = new JButton("Excluir");
		JButton btnCancelar = new JButton("Cancelar");
		
		txtIMC = new JTextField();
		txtIMC.setEnabled(false);
		txtIMC.setEditable(false);
		txtIMC.setBounds(407, 62, 57, 20);
		panel.add(txtIMC);
		txtIMC.setColumns(10);

		// btnCadastrar
		btnCadastrar.setBounds(11, 61, 89, 23);
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Instanciar Objeto
				Beans b = new Beans();
				b.setNome(txtNome.getText());
				b.setIdade(Integer.parseInt(txtIdade.getText()));
				b.setAltura(Double.parseDouble(txtAltura.getText()));
				b.setPeso(Double.parseDouble(txtPeso.getText()));

				// Realizar Cadastro
				a.cadastrar(b);
				
				// Atualizar tabela
				table.setModel(a.selecionar());
				
				// Limpar campos
				txtNome.setText("");
				txtIdade.setText("");
				txtAltura.setText("");
				txtPeso.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				// Botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);

			}
		});

		// btnAlterar
		btnAlterar.setBounds(110, 61, 89, 23);
		panel.add(btnAlterar);
		btnAlterar.setEnabled(false);

		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Instanciar Objeto
				Beans b = new Beans();
				b.setNome(txtNome.getText());
				b.setIdade(Integer.parseInt(txtIdade.getText()));
				b.setAltura(Double.parseDouble(txtAltura.getText()));
				b.setPeso(Double.parseDouble(txtPeso.getText()));

				// Realizar Cadastro
				a.alterar(codigoDados, b);
				
				// Atualizar tabela
				table.setModel(a.selecionar());
				
				// Limpar campos
				txtNome.setText("");
				txtIdade.setText("");
				txtAltura.setText("");
				txtPeso.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});

		// btnExcluir
		btnExcluir.setBounds(209, 61, 89, 23);
		panel.add(btnExcluir);
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Remover o curso
				a.excluir(codigoDados);
				
				// Atualizar tabela
				table.setModel(a.selecionar());
				
				// Limpar campos
				txtNome.setText("");
				txtIdade.setText("");
				txtAltura.setText("");
				txtPeso.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		// btnCancelar
		btnCancelar.setBounds(308, 61, 89, 23);
		panel.add(btnCancelar);
		btnCancelar.setEnabled(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Limpar campos
				txtNome.setText("");
				txtIdade.setText("");
				txtAltura.setText("");
				txtPeso.setText("");
				
				//Focus
				txtNome.requestFocus();
				
				// Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);

			}
		});
		
		// JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 454, 345);
		panel.add(scrollPane);
		

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Obter o indice da tabela
				int indice = table.getSelectedRow();

				// Obter o valor do indice no atributo
				codigoDados = indice;

				// Selecionando dados do Curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtIdade.setText(table.getValueAt(indice, 1).toString());
				txtAltura.setText(table.getValueAt(indice, 2).toString());
				txtPeso.setText(table.getValueAt(indice, 3).toString());

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

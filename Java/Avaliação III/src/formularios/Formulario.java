package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtColaborador;
	private JTextField txtSalarioBruto;
	private JTextField txtValeTransporte;
	private JTextField txtImpostoDeRenda;
	private JTextField txtSalarioLiquido;
	private JTable table;
	private static Double sBruto;

	public Formulario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 216, 551, 334);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		// JLabel
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblColaborador.setBounds(11, 11, 90, 30);
		contentPane.add(lblColaborador);

		JLabel lblSalarioBruto = new JLabel("Salario Bruto");
		lblSalarioBruto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalarioBruto.setBounds(11, 52, 90, 30);
		contentPane.add(lblSalarioBruto);

		JLabel lblValeTransporte = new JLabel("Vale Transporte");
		lblValeTransporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValeTransporte.setBounds(11, 93, 90, 30);
		contentPane.add(lblValeTransporte);

		JLabel lblFaltasNoMes = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFaltasNoMes.setBounds(11, 134, 90, 30);
		contentPane.add(lblFaltasNoMes);

		JLabel lblCargos = new JLabel("Cargos");
		lblCargos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCargos.setBounds(292, 11, 90, 30);
		contentPane.add(lblCargos);

		JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
		lblImpostoDeRenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImpostoDeRenda.setBounds(292, 93, 100, 30);
		contentPane.add(lblImpostoDeRenda);

		JLabel lblSalarioLquido = new JLabel("Salario L\u00EDquido");
		lblSalarioLquido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalarioLquido.setBounds(292, 134, 100, 30);
		contentPane.add(lblSalarioLquido);

		// JTextField
		txtColaborador = new JTextField();
		txtColaborador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtColaborador.setBounds(101, 12, 180, 30);
		contentPane.add(txtColaborador);
		txtColaborador.setColumns(10);

		txtSalarioBruto = new JTextField();
		txtSalarioBruto.setEditable(false);
		txtSalarioBruto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSalarioBruto.setBounds(101, 52, 180, 30);
		contentPane.add(txtSalarioBruto);
		txtSalarioBruto.setColumns(10);

		txtValeTransporte = new JTextField();
		txtValeTransporte.setEditable(false);
		txtValeTransporte.setBounds(131, 94, 150, 30);
		contentPane.add(txtValeTransporte);
		txtValeTransporte.setColumns(10);

		txtImpostoDeRenda = new JTextField();
		txtImpostoDeRenda.setEditable(false);
		txtImpostoDeRenda.setBounds(412, 94, 150, 30);
		contentPane.add(txtImpostoDeRenda);
		txtImpostoDeRenda.setColumns(10);

		txtSalarioLiquido = new JTextField();
		txtSalarioLiquido.setEditable(false);
		txtSalarioLiquido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSalarioLiquido.setBounds(412, 135, 150, 30);
		contentPane.add(txtSalarioLiquido);
		txtSalarioLiquido.setColumns(10);

		// JButton
		JButton btnCadastrarColaborador = new JButton("Cadastrar Colaborador");
		btnCadastrarColaborador.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrarColaborador.setBounds(11, 175, 270, 30);
		contentPane.add(btnCadastrarColaborador);

		JButton btnEstatsticas = new JButton("Estatística");
		btnEstatsticas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEstatsticas.setBounds(292, 175, 270, 30);
		contentPane.add(btnEstatsticas);

		// JCheckBox
		JCheckBox chbValeTransporte = new JCheckBox("");
		chbValeTransporte.setBounds(101, 93, 30, 30);
		contentPane.add(chbValeTransporte);

		JCheckBox chbClubeFelicidade = new JCheckBox("Clube Felicidade");
		chbClubeFelicidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chbClubeFelicidade.setBounds(292, 52, 120, 30);
		contentPane.add(chbClubeFelicidade);

		JCheckBox chbPlanoDeSade = new JCheckBox("Plano de Sa\u00FAde");
		chbPlanoDeSade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chbPlanoDeSade.setBounds(442, 52, 120, 30);
		contentPane.add(chbPlanoDeSade);

		// JSpinner
		JSpinner spinner = new JSpinner();
		spinner.setBounds(101, 134, 60, 30);
		contentPane.add(spinner);

		// JComboBox
		JComboBox cbCargos = new JComboBox();
		cbCargos.setBounds(382, 12, 180, 30);
		contentPane.add(cbCargos);
		cbCargos.addItem("Selecione");
		cbCargos.addItem("Estagiário");
		cbCargos.addItem("Desenvolvedor Jr");
		cbCargos.addItem("Desenvolvedor Pleno");
		cbCargos.addItem("Desenvolvedor Sênior");
		cbCargos.addItem("Analista de Sistemas Jr");
		cbCargos.addItem("Analista de Sistemas Pleno");
		cbCargos.addItem("Analista de Sistemas Sênior");
		cbCargos.addItem("Arquiteto de Software");

		
		 
		cbCargos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbCargos.getSelectedItem().equals("Estagiário")) {
					sBruto = 900.00;
					txtSalarioBruto.setText("R$ "+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Desenvolvedor Jr")) {
					sBruto = 1300.00;
					txtSalarioBruto.setText("R$ "+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Desenvolvedor Pleno")) {
					sBruto = 1800.00;
					txtSalarioBruto.setText("R$ 1.800,00"+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Desenvolvedor Sênior")) {
					sBruto = 2400.00;
					txtSalarioBruto.setText("R$ 2.400,00"+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Analista de Sistemas Jr")) {
					sBruto = 2700.00;
					txtSalarioBruto.setText("R$ 2.700,00"+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Analista de Sistemas Pleno")) {
					sBruto = 900.00;
					txtSalarioBruto.setText("R$ 3.200,00"+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Analista de Sistemas Sênior")) {
					sBruto = 900.00;
					txtSalarioBruto.setText("R$ 3.600,00"+sBruto);
				} else if (cbCargos.getSelectedItem().equals("Arquiteto de Software")) {
					sBruto = 900.00;
					txtSalarioBruto.setText("R$ 4.400,00"+sBruto);
				} else {

				}
			}
		});

	}

}



package exercicios01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField visor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 257, 90, 30);
		panel.add(btn0);

		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "0");

			}
		});

		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 216, 90, 30);
		panel.add(btn1);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "1");

			}
		});

		JButton btn2 = new JButton("2");
		btn2.setBounds(110, 216, 90, 30);
		panel.add(btn2);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "2");

			}
		});

		JButton btn3 = new JButton("3");
		btn3.setBounds(210, 216, 90, 30);
		panel.add(btn3);

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "3");

			}
		});

		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 175, 90, 30);
		panel.add(btn4);

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "4");

			}
		});

		JButton btn5 = new JButton("5");
		btn5.setBounds(110, 175, 90, 30);
		panel.add(btn5);

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "5");

			}
		});

		JButton btn6 = new JButton("6");
		btn6.setBounds(210, 175, 90, 30);
		panel.add(btn6);

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "6");

			}
		});

		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 134, 90, 30);
		panel.add(btn7);

		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "7");

			}
		});

		JButton btn8 = new JButton("8");
		btn8.setBounds(110, 134, 90, 30);
		panel.add(btn8);

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "8");

			}
		});

		JButton btn9 = new JButton("9");
		btn9.setBounds(210, 134, 90, 30);
		panel.add(btn9);

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "9");

			}
		});

		JButton btnPonto = new JButton(".");
		btnPonto.setBounds(110, 257, 90, 30);
		panel.add(btnPonto);

		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + ".");

			}
		});

		JButton btnSoma = new JButton("+");
		btnSoma.setBounds(310, 134, 90, 30);
		panel.add(btnSoma);

		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "+");

			}
		});

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "-");

			}
		});
		btnSubtracao.setBounds(310, 175, 90, 30);
		panel.add(btnSubtracao);

		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.setBounds(310, 216, 90, 30);
		panel.add(btnMultiplicacao);

		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "x");

			}
		});

		JButton btnDivisao = new JButton("÷");
		btnDivisao.setBounds(310, 257, 90, 30);
		panel.add(btnDivisao);

		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "÷");

			}
		});

		JButton btnSin = new JButton("sin");
		btnSin.setBounds(10, 93, 90, 30);
		panel.add(btnSin);

		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnCos = new JButton("cos");
		btnCos.setBounds(110, 93, 90, 30);
		panel.add(btnCos);

		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnTan = new JButton("tan");
		btnTan.setBounds(210, 93, 90, 30);
		panel.add(btnTan);

		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(210, 257, 90, 30);
		panel.add(btnIgual);

		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + "=");

			}
		});

		JButton btnLog = new JButton("Log");
		btnLog.setBounds(10, 52, 90, 30);
		panel.add(btnLog);

		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnRaizCubica = new JButton("\u00B2\u221A");
		btnRaizCubica.setBounds(110, 52, 90, 30);
		panel.add(btnRaizCubica);

		btnRaizCubica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnRaizQuadrada = new JButton("\u00B3\u221A");
		btnRaizQuadrada.setBounds(210, 52, 90, 30);
		panel.add(btnRaizQuadrada);

		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnC = new JButton("C");
		btnC.setBounds(310, 52, 90, 30);
		panel.add(btnC);

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText("");

			}
		});

		JButton btnCE = new JButton("CE");
		btnCE.setBounds(310, 93, 90, 30);
		panel.add(btnCE);

		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		visor = new JTextField("");
		visor.setEditable(false);
		visor.setBounds(10, 11, 390, 30);
		visor.setHorizontalAlignment(visor.RIGHT);
		panel.add(visor);
		visor.setColumns(10);
	}
	
}

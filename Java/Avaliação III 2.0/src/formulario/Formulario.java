package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel Painel;
	private JTextField textField;

	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		JLabel lblQuantidde = new JLabel("Quantidde");
		lblQuantidde.setBounds(10, 11, 90, 30);
		Painel.add(lblQuantidde);
		
		textField = new JTextField();
		textField.setBounds(70, 11, 90, 30);
		Painel.add(textField);
		textField.setColumns(10);
		
		JButton btnCAzul = new JButton("Camisa Azul");		
		btnCAzul.setBounds(10, 52, 100, 100);
		Painel.add(btnCAzul);
		
		JButton btnSAzul = new JButton("Shorts Azul");
		btnSAzul.setBounds(120, 52, 100, 100);
		Painel.add(btnSAzul);
		
		JButton btnCRosa = new JButton("Camisa Rosa");
		btnCRosa.setBounds(230, 52, 100, 100);
		Painel.add(btnCRosa);
		
		JButton btnSRosa = new JButton("Shorts Rosa");
		btnSRosa.setBounds(340, 52, 100, 100);
		Painel.add(btnSRosa);
		
		JButton btnCOAzul = new JButton("Colete Azul");
		btnCOAzul.setBounds(10, 214, 100, 100);
		Painel.add(btnCOAzul);
		
		JButton btnTAzul = new JButton("Tenis Azul");				
		btnTAzul.setBounds(120, 214, 100, 100);
		Painel.add(btnTAzul);
		
		JButton btnCORosa = new JButton("Colete Rosa");
		btnCORosa.setBounds(230, 214, 100, 100);
		Painel.add(btnCORosa);
		
		JButton btnTRosa = new JButton("Tenis Rosa");
		btnTRosa.setBounds(340, 214, 100, 100);
		Painel.add(btnTRosa);
		
		JButton btnMais1 = new JButton("+");
		btnMais1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cAzul = 0;
				cAzul++;
			}
		});
		btnMais1.setBounds(10, 163, 50, 40);
		Painel.add(btnMais1);
		
		JButton btnMenos1 = new JButton("-");
		btnMenos1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sAzul = 0;
				sAzul--;
			}
		});
		btnMenos1.setBounds(70, 163, 40, 40);
		Painel.add(btnMenos1);
		
		JButton btnMais2 = new JButton("+");
		btnMais2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cRosa = 0;
				cRosa++;
			}
		});
		btnMais2.setBounds(120, 163, 50, 40);
		Painel.add(btnMais2);
		
		JButton btnMenos2 = new JButton("-");
		btnMenos2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sRosa = 0;
				sRosa--;
			}
		});
		btnMenos2.setBounds(180, 163, 40, 40);
		Painel.add(btnMenos2);
		
		JButton btnMais3 = new JButton("+");
		btnMais3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coRosa = 0;
				coRosa++;
			}
		});
		btnMais3.setBounds(230, 163, 50, 40);
		Painel.add(btnMais3);
		
		JButton btnMenos3 = new JButton("-");		
		btnMenos3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coRosa = 0;
				coRosa--;
			}
		});
		btnMenos3.setBounds(290, 163, 40, 40);
		Painel.add(btnMenos3);
		
		JButton btnMais4 = new JButton("+");		
		btnMais4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tRosa = 0;
				tRosa++;
			}
		});
		btnMais4.setBounds(340, 163, 50, 40);
		Painel.add(btnMais4);
		
		JButton btnMenos4 = new JButton("-");
		btnMenos4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tRosa = 0;
				tRosa--;
			}
		});
		btnMenos4.setBounds(400, 163, 40, 40);
		Painel.add(btnMenos4);
		
		JButton btnMais5 = new JButton("+");
		btnMais5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coAzul = 0;
				coAzul++;
			}
		});
		btnMais5.setBounds(10, 325, 50, 40);
		Painel.add(btnMais5);
		
		JButton btnMenos5 = new JButton("-");
		btnMenos5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coAzul = 0;
				coAzul++;
			}
		});
		btnMenos5.setBounds(70, 325, 40, 40);
		Painel.add(btnMenos5);
		
		JButton btnMais6 = new JButton("+");
		btnMais6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tAzul = 0;
				tAzul++;
			}
		});
		btnMais6.setBounds(120, 325, 50, 40);
		Painel.add(btnMais6);
		
		JButton btnMenos6 = new JButton("-");
		btnMenos6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tAzul = 0;
				tAzul++;
			}
		});
		btnMenos6.setBounds(180, 325, 40, 40);
		Painel.add(btnMenos6);
		
		JButton btnMais7 = new JButton("+");
		btnMais7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coRosa = 0;
				coRosa++;
			}
		});
		btnMais7.setBounds(230, 325, 50, 40);
		Painel.add(btnMais7);
		
		JButton btnMenos7 = new JButton("-");
		btnMenos7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int coRosa = 0;
				coRosa++;
			}
		});
		btnMenos7.setBounds(290, 325, 40, 40);
		Painel.add(btnMenos7);
		
		JButton btnMais8 = new JButton("+");
		btnMais8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tRosa = 0;
				tRosa++;
			}
		});
		btnMais8.setBounds(340, 325, 50, 40);
		Painel.add(btnMais8);
		
		JButton btnMenos8 = new JButton("-");
		btnMenos8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tRosa = 0;
				tRosa++;
			}
		});
		btnMenos8.setBounds(400, 325, 40, 40);
		Painel.add(btnMenos8);
		
		JButton btnEstatisticas = new JButton("Estatisticas");
		btnEstatisticas.setBounds(350, 11, 90, 30);
		Painel.add(btnEstatisticas);
		
		
		

	}

}

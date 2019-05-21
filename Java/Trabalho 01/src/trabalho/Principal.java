package trabalho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Principal {

	static int indiceCadastro = 0;

	public static void main(String[] args) {

		String[][] matriz = new String[1000][20];

		// Login Inicial: Interface
		JFrame LoginInicial = new JFrame();
		LoginInicial.setSize(300, 170);
		LoginInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginInicial.setTitle("Sistema");
		LoginInicial.setLocationRelativeTo(null);
		LoginInicial.setLayout(null);

		// Login Inicial: Rótulo
		JLabel liID = new JLabel();
		liID.setText("Informe seu ID:");
		liID.setBounds(10, 10, 130, 30);

		JLabel liSenha = new JLabel();
		liSenha.setText("Informe sua senha:");
		liSenha.setBounds(10, 40, 130, 30);

		// Login Inicial: Campo de Texto
		JTextField cID = new JTextField();
		cID.setBounds(125, 10, 150, 30);

		JTextField cSenha = new JTextField();
		cSenha.setBounds(125, 40, 150, 30);

		// Login Iicial: Botão Login
		JButton login = new JButton("Login");
		login.setBounds(20, 90, 100, 30);

		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(160, 90, 100, 30);

		// Login Inicial: Botões do Formulario
		LoginInicial.add(liID);
		LoginInicial.add(liSenha);
		LoginInicial.add(cID);
		LoginInicial.add(cSenha);
		LoginInicial.add(login);
		LoginInicial.add(cadastrar);

		// Informações Pessoais: Frame
		JFrame informações = new JFrame();
		informações.setSize(1280, 720);
		informações.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		informações.setTitle("Sistema");
		informações.setLocationRelativeTo(null);
		informações.setLayout(null);

		// Informações Pessoais: Interface
		JPanel InformaçõesPessoais = new JPanel();
		InformaçõesPessoais.setSize(1280, 720);
		InformaçõesPessoais.setLayout(null);

		// Informações Pessoais: Rótulo
		JLabel iPessoal = new JLabel();
		iPessoal.setText("Informação Pessoal:");
		iPessoal.setBounds(10, 10, 130, 30);

		JLabel iCPF = new JLabel();
		iCPF.setText("CPF:");
		iCPF.setBounds(10, 40, 130, 30);

		JLabel iNome = new JLabel();
		iNome.setText("Nome:");
		iNome.setBounds(10, 100, 130, 30);

		JLabel iDNascimento = new JLabel();
		iDNascimento.setText("Data de nascimento:");
		iDNascimento.setBounds(10, 160, 130, 30);

		JLabel iSexo = new JLabel();
		iSexo.setText("Sexo:");
		iSexo.setBounds(10, 220, 130, 30);

		JLabel iEmail = new JLabel();
		iEmail.setText("Email:");
		iEmail.setBounds(10, 280, 130, 30);

		// Informações Pessoais: Campo de Texto

		JTextField cCPF = new JTextField();
		cCPF.setBounds(10, 70, 250, 30);

		JTextField cNome = new JTextField();
		cNome.setBounds(10, 130, 250, 30);

		JTextField cDNascimento = new JTextField();
		cDNascimento.setBounds(10, 190, 250, 30);

		JTextField cEmail = new JTextField();
		cEmail.setBounds(10, 310, 250, 30);

		// Informações Pessoais: Radio Button
		JRadioButton sMas = new JRadioButton("Masculino");
		sMas.setBounds(10, 250, 130, 30);

		JRadioButton sFem = new JRadioButton("Feminino");
		sFem.setBounds(140, 250, 130, 30);

		// Informações Pessoais: Agrupar botoes
		ButtonGroup bgSexo = new ButtonGroup();
		bgSexo.add(sMas);
		bgSexo.add(sFem);

		// Dados de Acesso: Rótulo
		JLabel DadosAcesso = new JLabel();
		DadosAcesso.setText("Dados de Acesso:");
		DadosAcesso.setBounds(10, 340, 130, 30);

		JLabel daID = new JLabel();
		daID.setText("idFast:");
		daID.setBounds(10, 370, 130, 30);

		JLabel daCSenha = new JLabel();
		daCSenha.setText("Senha:");
		daCSenha.setBounds(10, 430, 130, 30);

		// Dados de Acesso: Campo de Texto
		JTextField ID = new JTextField();
		ID.setBounds(10, 400, 250, 30);

		JTextField cCSenha = new JTextField();
		cCSenha.setBounds(10, 460, 250, 30);

		// Endereço Principal: Rótulo
		JLabel EndereçoPrincipal = new JLabel();
		EndereçoPrincipal.setText("Endereço Principal:");
		EndereçoPrincipal.setBounds(400, 10, 130, 30);

		JLabel epEstados = new JLabel();
		epEstados.setText("Estados:");
		epEstados.setBounds(400, 40, 130, 30);

		JLabel epCEP = new JLabel();
		epCEP.setText("CEP:");
		epCEP.setBounds(400, 100, 130, 30);

		JLabel epEndereço = new JLabel();
		epEndereço.setText("Endereço:");
		epEndereço.setBounds(400, 160, 130, 30);

		JLabel epNumero = new JLabel();
		epNumero.setText("Número:");
		epNumero.setBounds(400, 220, 130, 30);

		JLabel epComplemento = new JLabel();
		epComplemento.setText("Complemento:");
		epComplemento.setBounds(400, 280, 130, 30);

		JLabel epBairro = new JLabel();
		epBairro.setText("Bairro:");
		epBairro.setBounds(400, 370, 130, 30);

		JLabel epCidade = new JLabel();
		epCidade.setText("Cidade:");
		epCidade.setBounds(400, 430, 130, 30);

		JLabel epTelefone = new JLabel();
		epTelefone.setText("Telefone/Celular:");
		epTelefone.setBounds(400, 490, 130, 30);

		// Endereço Principal: Campo de Texto
		JTextField cCEP = new JTextField();
		cCEP.setBounds(400, 130, 250, 30);

		JTextField cEndereço = new JTextField();
		cEndereço.setBounds(400, 190, 250, 30);

		JTextField cNumero = new JTextField();
		cNumero.setBounds(400, 250, 250, 30);

		JTextField cComplemento = new JTextField();
		cComplemento.setBounds(400, 310, 250, 60);

		JTextField cBairro = new JTextField();
		cBairro.setBounds(400, 400, 250, 30);

		JTextField cCidade = new JTextField();
		cCidade.setBounds(400, 460, 250, 30);

		JTextField cTelefone = new JTextField();
		cTelefone.setBounds(400, 520, 250, 30);

		// Endereço Principal: Caixa de combinação
		JComboBox<String> estadosLista = new JComboBox<String>();
		estadosLista.setBounds(400, 70, 250, 30);
		estadosLista.addItem("Acre");
		estadosLista.addItem("Alagoas");
		estadosLista.addItem("Amapá");
		estadosLista.addItem("Amazonas");
		estadosLista.addItem("Bahia");
		estadosLista.addItem("Ceará");
		estadosLista.addItem("Distrito Federal");
		estadosLista.addItem("Goiás");
		estadosLista.addItem("Espírito Santo");
		estadosLista.addItem("Maranhão");
		estadosLista.addItem("Mato Grosso");
		estadosLista.addItem("Mato Grosso do Sul");
		estadosLista.addItem("Minas Gerais");
		estadosLista.addItem("Pará");
		estadosLista.addItem("Paraiba");
		estadosLista.addItem("Paraná");
		estadosLista.addItem("Pernanbuco");
		estadosLista.addItem("Piauí");
		estadosLista.addItem("Rio de Janeiro");
		estadosLista.addItem("Rio Grande do Norte");
		estadosLista.addItem("Rio Grande do Sul");
		estadosLista.addItem("Rondônia");
		estadosLista.addItem("Rorâima");
		estadosLista.addItem("São Paulo");
		estadosLista.addItem("Santa Catarina");
		estadosLista.addItem("Sergipe");
		estadosLista.addItem("Tocantis");

		// Interface: Botão Salvar
		JButton salvar = new JButton("Salvar");
		salvar.setBounds(20, 520, 100, 30);

		JButton Login2 = new JButton("Login");
		Login2.setBounds(150, 520, 100, 30);

		// Informações Pessoais: Botões do Formulario
		InformaçõesPessoais.add(iPessoal);
		InformaçõesPessoais.add(iCPF);
		InformaçõesPessoais.add(iNome);
		InformaçõesPessoais.add(iDNascimento);
		InformaçõesPessoais.add(iSexo);
		InformaçõesPessoais.add(iEmail);
		InformaçõesPessoais.add(cCPF);
		InformaçõesPessoais.add(cNome);
		InformaçõesPessoais.add(cDNascimento);
		InformaçõesPessoais.add(cEmail);
		InformaçõesPessoais.add(sMas);
		InformaçõesPessoais.add(sFem);
		InformaçõesPessoais.add(DadosAcesso);
		InformaçõesPessoais.add(daID);
		InformaçõesPessoais.add(daCSenha);
		InformaçõesPessoais.add(ID);
		InformaçõesPessoais.add(cCSenha);
		InformaçõesPessoais.add(EndereçoPrincipal);
		InformaçõesPessoais.add(epEstados);
		InformaçõesPessoais.add(epCEP);
		InformaçõesPessoais.add(epCidade);
		InformaçõesPessoais.add(epBairro);
		InformaçõesPessoais.add(epEndereço);
		InformaçõesPessoais.add(epNumero);
		InformaçõesPessoais.add(epComplemento);
		InformaçõesPessoais.add(epTelefone);
		InformaçõesPessoais.add(cCEP);
		InformaçõesPessoais.add(cCidade);
		InformaçõesPessoais.add(cBairro);
		InformaçõesPessoais.add(cEndereço);
		InformaçõesPessoais.add(cNumero);
		InformaçõesPessoais.add(cComplemento);
		InformaçõesPessoais.add(cTelefone);
		InformaçõesPessoais.add(estadosLista);
		InformaçõesPessoais.add(salvar);
		InformaçõesPessoais.add(Login2);

		// Opções: Interface
		JPanel Opções = new JPanel();
		Opções.setSize(1280, 720);
		Opções.setLayout(null);

		// Endereço Principal: Rótulo
		JLabel opções = new JLabel();
		opções.setText("Selecione uma das Opções abaixo:");
		opções.setBounds(520, 140, 400, 40);

		// Opções: Botões
		JButton eEncomenda = new JButton("Enviar uma Encomenda");
		eEncomenda.setBounds(420, 240, 400, 40);

		JButton eCaminho = new JButton("Encomendas a Caminho");
		eCaminho.setBounds(420, 340, 400, 40);

		JButton Historico = new JButton("Historico de Encomendas");
		Historico.setBounds(420, 440, 400, 40);

		// Opções: Botões do Formulario
		Opções.add(opções);
		Opções.add(eEncomenda);
		Opções.add(eCaminho);
		Opções.add(Historico);

		// Encomenda: Interface
		JPanel Encomenda = new JPanel();
		Encomenda.setSize(1280, 720);
		Encomenda.setLayout(null);

		// Encomenda: Rótulo
		JLabel Descrição = new JLabel();
		Descrição.setText("Descrição do Produto:");
		Descrição.setBounds(10, 10, 130, 30);

		JLabel Tamanho = new JLabel();
		Tamanho.setText("Tamanho do Produto:");
		Tamanho.setBounds(10, 70, 130, 30);

		JLabel Peso = new JLabel();
		Peso.setText("Peso do Produto:");
		Peso.setBounds(10, 190, 130, 30);

		JLabel Valor = new JLabel();
		Valor.setText("Valor do Produto:");
		Valor.setBounds(10, 250, 130, 30);

		// Encomenda: Campo de Texto
		JTextField cDescrição = new JTextField();
		cDescrição.setBounds(10, 40, 250, 30);

		JTextField cPeso = new JTextField();
		cPeso.setBounds(10, 220, 250, 30);

		JTextField cValor = new JTextField();
		cValor.setBounds(10, 280, 250, 30);

		// Dados do Destinatario: Rótulo
		JLabel DadosDestinatario = new JLabel();
		DadosDestinatario.setText("Destinatario:");
		DadosDestinatario.setBounds(400, 10, 130, 30);

		JLabel ddEstados = new JLabel();
		ddEstados.setText("Estados:");
		ddEstados.setBounds(400, 40, 130, 30);

		JLabel ddCEP = new JLabel();
		ddCEP.setText("CEP:");
		ddCEP.setBounds(400, 100, 130, 30);

		JLabel ddEndereço = new JLabel();
		ddEndereço.setText("Endereço:");
		ddEndereço.setBounds(400, 160, 130, 30);

		JLabel ddNumero = new JLabel();
		ddNumero.setText("Número:");
		ddNumero.setBounds(400, 220, 130, 30);

		JLabel ddComplemento = new JLabel();
		ddComplemento.setText("Complemento:");
		ddComplemento.setBounds(400, 280, 130, 30);

		JLabel ddBairro = new JLabel();
		ddBairro.setText("Bairro:");
		ddBairro.setBounds(400, 370, 130, 30);

		JLabel ddCidade = new JLabel();
		ddCidade.setText("Cidade:");
		ddCidade.setBounds(400, 430, 130, 30);

		JLabel ddTelefone = new JLabel();
		ddTelefone.setText("Telefone/Celular:");
		ddTelefone.setBounds(400, 490, 130, 30);

		// Dados do Destinatario: Campo de Texto
		JTextField cdCEP = new JTextField();
		cdCEP.setBounds(400, 130, 250, 30);

		JTextField cdEndereço = new JTextField();
		cdEndereço.setBounds(400, 190, 250, 30);

		JTextField cdNumero = new JTextField();
		cdNumero.setBounds(400, 250, 250, 30);

		JTextField cdComplemento = new JTextField();
		cdComplemento.setBounds(400, 310, 250, 60);

		JTextField cdBairro = new JTextField();
		cdBairro.setBounds(400, 400, 250, 30);

		JTextField cdCidade = new JTextField();
		cdCidade.setBounds(400, 460, 250, 30);

		JTextField cdTelefone = new JTextField();
		cdTelefone.setBounds(400, 520, 250, 30);

		// Dados do Destinatario: Caixa de combinação
		JComboBox<String> ddestadosLista = new JComboBox<String>();
		ddestadosLista.setBounds(400, 70, 250, 30);
		ddestadosLista.addItem("Acre");
		ddestadosLista.addItem("Alagoas");
		ddestadosLista.addItem("Amapá");
		ddestadosLista.addItem("Amazonas");
		ddestadosLista.addItem("Bahia");
		ddestadosLista.addItem("Ceará");
		ddestadosLista.addItem("Distrito Federal");
		ddestadosLista.addItem("Goiás");
		ddestadosLista.addItem("Espírito Santo");
		ddestadosLista.addItem("Maranhão");
		ddestadosLista.addItem("Mato Grosso");
		ddestadosLista.addItem("Mato Grosso do Sul");
		ddestadosLista.addItem("Minas Gerais");
		ddestadosLista.addItem("Pará");
		ddestadosLista.addItem("Paraiba");
		ddestadosLista.addItem("Paraná");
		ddestadosLista.addItem("Pernanbuco");
		ddestadosLista.addItem("Piauí");
		ddestadosLista.addItem("Rio de Janeiro");
		ddestadosLista.addItem("Rio Grande do Norte");
		ddestadosLista.addItem("Rio Grande do Sul");
		ddestadosLista.addItem("Rondônia");
		ddestadosLista.addItem("Rorâima");
		ddestadosLista.addItem("São Paulo");
		ddestadosLista.addItem("Santa Catarina");
		ddestadosLista.addItem("Sergipe");
		ddestadosLista.addItem("Tocantis");

		// Dados do Destinatario: Radio Button
		JRadioButton pequeno = new JRadioButton("Pequeno");
		pequeno.setBounds(10, 100, 130, 30);

		JRadioButton medio = new JRadioButton("Médio");
		medio.setBounds(10, 130, 130, 30);

		JRadioButton grande = new JRadioButton("Grande");
		grande.setBounds(10, 160, 130, 30);

		// Dados do Destinatario: Agrupar botoes
		ButtonGroup bgTamanho = new ButtonGroup();
		bgTamanho.add(pequeno);
		bgTamanho.add(medio);
		bgTamanho.add(grande);

		// Dados do Destinatario: Agrupar botoes
		JButton finalizar = new JButton("Finalizar");
		finalizar.setBounds(20, 340, 100, 30);

		JButton voltar = new JButton("Voltar");
		voltar.setBounds(150, 340, 100, 30);

		// Encomenda: Botões do Formulario
		Encomenda.add(Descrição);
		Encomenda.add(Tamanho);
		Encomenda.add(Peso);
		Encomenda.add(Valor);
		Encomenda.add(cDescrição);
		Encomenda.add(cPeso);
		Encomenda.add(cValor);
		Encomenda.add(DadosDestinatario);
		Encomenda.add(ddBairro);
		Encomenda.add(ddCEP);
		Encomenda.add(ddCidade);
		Encomenda.add(ddComplemento);
		Encomenda.add(ddEndereço);
		Encomenda.add(ddEstados);
		Encomenda.add(ddNumero);
		Encomenda.add(ddTelefone);
		Encomenda.add(cdBairro);
		Encomenda.add(cdCEP);
		Encomenda.add(cdCidade);
		Encomenda.add(cdComplemento);
		Encomenda.add(cdEndereço);
		Encomenda.add(cdNumero);
		Encomenda.add(cdTelefone);
		Encomenda.add(ddestadosLista);
		Encomenda.add(pequeno);
		Encomenda.add(medio);
		Encomenda.add(grande);
		Encomenda.add(finalizar);
		Encomenda.add(voltar);

		// Caminho: Interface
		JPanel Caminho = new JPanel();
		Caminho.setSize(1280, 720);
		Caminho.setLayout(null);

		// Caminho: Caixa de combinação
		JComboBox<String> paCaminho = new JComboBox<String>();
		paCaminho.setBounds(10, 10, 1135, 30);
		paCaminho.addItem("Acre");

		// Dados do Destinatario: Agrupar botoes
		JButton voltar1 = new JButton("Voltar");
		voltar1.setBounds(1155, 10, 100, 30);

		// Caminho: Botões do Formulario
		Caminho.add(paCaminho);
		Caminho.add(voltar1);

		// Caminho: Interface
		JPanel HistoricoPedidos = new JPanel();
		HistoricoPedidos.setSize(1280, 720);
		HistoricoPedidos.setLayout(null);

		// Dados do Destinatario: Rótulo
		JLabel hPedidos = new JLabel();
		hPedidos.setText("Histórco de Pedidos:");
		hPedidos.setBounds(10, 10, 1135, 30);

		// Dados do Destinatario: Agrupar botoes
		JButton voltar2 = new JButton("Voltar");
		voltar2.setBounds(1155, 10, 100, 30);

		// Caminho: Botões do Formulario
		HistoricoPedidos.add(hPedidos);
		HistoricoPedidos.add(voltar2);

		// Frame
		informações.add(InformaçõesPessoais);
		informações.add(Opções);
		informações.add(Encomenda);
		informações.add(Caminho);
		informações.add(HistoricoPedidos);

		// Frames
		LoginInicial.setVisible(true);
		informações.setVisible(false);

		cadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(true);
				Opções.setVisible(false);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		Login2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(true);
				informações.setVisible(false);

			}
		});

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(true);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		eEncomenda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(false);
				Encomenda.setVisible(true);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		eCaminho.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(false);
				Encomenda.setVisible(false);
				Caminho.setVisible(true);
				HistoricoPedidos.setVisible(false);

			}
		});

		Historico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(false);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(true);

			}
		});

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(true);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		voltar1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(true);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		voltar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				LoginInicial.setVisible(false);
				informações.setVisible(true);
				InformaçõesPessoais.setVisible(false);
				Opções.setVisible(true);
				Encomenda.setVisible(false);
				Caminho.setVisible(false);
				HistoricoPedidos.setVisible(false);

			}
		});

		salvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((ID.getText().equals("")) || (cCSenha.getText().equals("")) || (cCPF.getText().equals(""))
						|| (cNome.getText().equals("")) || (cDNascimento.getText().equals(""))
						|| (cEmail.getText().equals("")) || (bgSexo.getSelection().equals(null))
						|| (cCEP.getText().equals("")) || (cEndereço.getText().equals(""))
						|| (cNumero.getText().equals("")) || (cComplemento.getText().equals(""))
						|| (cBairro.getText().equals("")) || (cCidade.getText().equals(""))
						|| (cTelefone.getText().equals(""))) {
					JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");
				} else {
					matriz[indiceCadastro][0] = ID.getText();
					matriz[indiceCadastro][1] = cCSenha.getText();
					matriz[indiceCadastro][2] = cCPF.getText();
					matriz[indiceCadastro][3] = cNome.getText();
					matriz[indiceCadastro][4] = cDNascimento.getText();
					matriz[indiceCadastro][5] = cEmail.getText();
					matriz[indiceCadastro][6] = bgSexo.getSelection().getActionCommand();
					matriz[indiceCadastro][7] = cCEP.getText();
					matriz[indiceCadastro][8] = cEndereço.getText();
					matriz[indiceCadastro][9] = cNumero.getText();
					matriz[indiceCadastro][10] = cComplemento.getText();
					matriz[indiceCadastro][10] = cBairro.getText();
					matriz[indiceCadastro][10] = cCidade.getText();
					matriz[indiceCadastro][11] = cTelefone.getText();

					indiceCadastro++;
				}

			}
		});

	}

}

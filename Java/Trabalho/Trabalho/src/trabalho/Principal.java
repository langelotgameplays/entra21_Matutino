package trabalho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Principal {

	public static void main(String[] args) {

		// Login Iicial: Bot�o Login
		JButton login = new JButton("Login");
		login.setBounds(20, 90, 100, 30);

		JButton voltar1 = new JButton("Voltar");
		voltar1.setBounds(160, 90, 100, 30);

		// Login Inicial: Interface
		JFrame LoginInicial = new JFrame();
		LoginInicial.setSize(300, 170);
		LoginInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginInicial.setTitle("Sistema");
		LoginInicial.setLocationRelativeTo(null);
		LoginInicial.setLayout(null);

		// Login Inicial: R�tulo
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

		// Login Inicial: Bot�es do Formulario
		LoginInicial.add(liID);
		LoginInicial.add(liSenha);
		LoginInicial.add(cID);
		LoginInicial.add(cSenha);
		LoginInicial.add(login);
		LoginInicial.add(voltar1);

		// Login Inicial: Exibir Formulario
		LoginInicial.setVisible(true);

		// Interface: Bot�o Salvar
		JButton salvar = new JButton("Salvar");
		salvar.setBounds(20, 520, 100, 30);

		JButton voltar2 = new JButton("Voltar");
		voltar2.setBounds(150, 520, 100, 30);

		// Informa��es Pessoais: Interface
		JFrame Informa��esPessoais = new JFrame();
		Informa��esPessoais.setSize(1280, 720);
		Informa��esPessoais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Informa��esPessoais.setTitle("Sistema");
		Informa��esPessoais.setLocationRelativeTo(null);
		Informa��esPessoais.setLayout(null);

		// Informa��es Pessoais: R�tulo
		JLabel iPessoal = new JLabel();
		iPessoal.setText("Informa��o Pessoal:");
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

		// Informa��es Pessoais: Campo de Texto

		JTextField cCPF = new JTextField();
		cCPF.setBounds(10, 70, 250, 30);

		JTextField cNome = new JTextField();
		cNome.setBounds(10, 130, 250, 30);

		JTextField cDNascimento = new JTextField();
		cDNascimento.setBounds(10, 190, 250, 30);

		JTextField cEmail = new JTextField();
		cEmail.setBounds(10, 310, 250, 30);

		// Informa��es Pessoais: Radio Button
		JRadioButton sMas = new JRadioButton("Masculino");
		sMas.setBounds(10, 250, 130, 30);

		JRadioButton sFem = new JRadioButton("Feminino");
		sFem.setBounds(140, 250, 130, 30);

		// Informa��es Pessoais: Agrupar botoes
		ButtonGroup bgSexo = new ButtonGroup();
		bgSexo.add(sMas);
		bgSexo.add(sFem);

		// Dados de Acesso: R�tulo
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

		// Endere�o Principal: R�tulo
		JLabel Endere�oPrincipal = new JLabel();
		Endere�oPrincipal.setText("Endere�o Principal:");
		Endere�oPrincipal.setBounds(400, 10, 130, 30);

		JLabel epEstados = new JLabel();
		epEstados.setText("Estados:");
		epEstados.setBounds(400, 40, 130, 30);

		JLabel epCEP = new JLabel();
		epCEP.setText("CEP:");
		epCEP.setBounds(400, 100, 130, 30);

		JLabel epEndere�o = new JLabel();
		epEndere�o.setText("Endere�o:");
		epEndere�o.setBounds(400, 160, 130, 30);

		JLabel epNumero = new JLabel();
		epNumero.setText("N�mero:");
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

		// Endere�o Principal: Campo de Texto
		JTextField cCEP = new JTextField();
		cCEP.setBounds(400, 130, 250, 30);

		JTextField cEndere�o = new JTextField();
		cEndere�o.setBounds(400, 190, 250, 30);

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

		// Endere�o Principal: Caixa de combina��o
		JComboBox<String> estadosLista = new JComboBox<String>();
		estadosLista.setBounds(400, 70, 250, 30);
		estadosLista.addItem("Acre");
		estadosLista.addItem("Alagoas");
		estadosLista.addItem("Amap�");
		estadosLista.addItem("Amazonas");
		estadosLista.addItem("Bahia");
		estadosLista.addItem("Cear�");
		estadosLista.addItem("Distrito Federal");
		estadosLista.addItem("Goi�s");
		estadosLista.addItem("Esp�rito Santo");
		estadosLista.addItem("Maranh�o");
		estadosLista.addItem("Mato Grosso");
		estadosLista.addItem("Mato Grosso do Sul");
		estadosLista.addItem("Minas Gerais");
		estadosLista.addItem("Par�");
		estadosLista.addItem("Paraiba");
		estadosLista.addItem("Paran�");
		estadosLista.addItem("Pernanbuco");
		estadosLista.addItem("Piau�");
		estadosLista.addItem("Rio de Janeiro");
		estadosLista.addItem("Rio Grande do Norte");
		estadosLista.addItem("Rio Grande do Sul");
		estadosLista.addItem("Rond�nia");
		estadosLista.addItem("Ror�ima");
		estadosLista.addItem("S�o Paulo");
		estadosLista.addItem("Santa Catarina");
		estadosLista.addItem("Sergipe");
		estadosLista.addItem("Tocantis");

		// Informa��es Pessoais: Bot�es do Formulario
		Informa��esPessoais.add(iPessoal);
		Informa��esPessoais.add(iCPF);
		Informa��esPessoais.add(iNome);
		Informa��esPessoais.add(iDNascimento);
		Informa��esPessoais.add(iSexo);
		Informa��esPessoais.add(iEmail);
		Informa��esPessoais.add(cCPF);
		Informa��esPessoais.add(cNome);
		Informa��esPessoais.add(cDNascimento);
		Informa��esPessoais.add(cEmail);
		Informa��esPessoais.add(sMas);
		Informa��esPessoais.add(sFem);
		Informa��esPessoais.add(DadosAcesso);
		Informa��esPessoais.add(daID);
		Informa��esPessoais.add(daCSenha);
		Informa��esPessoais.add(ID);
		Informa��esPessoais.add(cCSenha);
		Informa��esPessoais.add(Endere�oPrincipal);
		Informa��esPessoais.add(epEstados);
		Informa��esPessoais.add(epCEP);
		Informa��esPessoais.add(epCidade);
		Informa��esPessoais.add(epBairro);
		Informa��esPessoais.add(epEndere�o);
		Informa��esPessoais.add(epNumero);
		Informa��esPessoais.add(epComplemento);
		Informa��esPessoais.add(epTelefone);
		Informa��esPessoais.add(cCEP);
		Informa��esPessoais.add(cCidade);
		Informa��esPessoais.add(cBairro);
		Informa��esPessoais.add(cEndere�o);
		Informa��esPessoais.add(cNumero);
		Informa��esPessoais.add(cComplemento);
		Informa��esPessoais.add(cTelefone);
		Informa��esPessoais.add(estadosLista);
		Informa��esPessoais.add(salvar);
		Informa��esPessoais.add(voltar2);

		// Informa��esPessoais: Exibir Formulario
		Informa��esPessoais.setVisible(true);

		// Op��es: Interface
		JFrame Op��es = new JFrame();
		Op��es.setSize(280, 250);
		Op��es.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Op��es.setTitle("Sistema");
		Op��es.setLocationRelativeTo(null);
		Op��es.setLayout(null);

		// Op��es: Bot�es
		JButton eEncomenda = new JButton("Enviar uma Encomenda");
		eEncomenda.setBounds(30, 30, 200, 30);

		JButton eCaminho = new JButton("Encomendas a Caminho");
		eCaminho.setBounds(30, 90, 200, 30);

		JButton Historico = new JButton("Historico de Encomendas");
		Historico.setBounds(30, 150, 200, 30);

		// Op��es: Bot�es do Formulario
		Op��es.add(eEncomenda);
		Op��es.add(eCaminho);
		Op��es.add(Historico);

		// Op��es: Exibir Formulario
		Op��es.setVisible(true);

		// Dados do Destinatario: Agrupar botoes
		JButton finalizar = new JButton("Finalizar");
		finalizar.setBounds(20, 340, 100, 30);

		JButton voltar3 = new JButton("Voltar");
		voltar3.setBounds(150, 340, 100, 30);

		// Encomenda: Interface
		JFrame Encomenda = new JFrame();
		Encomenda.setSize(1280, 720);
		Encomenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Encomenda.setTitle("Sistema");
		Encomenda.setLocationRelativeTo(null);
		Encomenda.setLayout(null);

		// Encomenda: R�tulo
		JLabel Descri��o = new JLabel();
		Descri��o.setText("Descri��o do Produto:");
		Descri��o.setBounds(10, 10, 130, 30);

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
		JTextField cDescri��o = new JTextField();
		cDescri��o.setBounds(10, 40, 250, 30);

		JTextField cPeso = new JTextField();
		cPeso.setBounds(10, 220, 250, 30);

		JTextField cValor = new JTextField();
		cValor.setBounds(10, 280, 250, 30);

		// Dados do Destinatario: R�tulo
		JLabel DadosDestinatario = new JLabel();
		DadosDestinatario.setText("Destinatario:");
		DadosDestinatario.setBounds(400, 10, 130, 30);

		JLabel ddEstados = new JLabel();
		ddEstados.setText("Estados:");
		ddEstados.setBounds(400, 40, 130, 30);

		JLabel ddCEP = new JLabel();
		ddCEP.setText("CEP:");
		ddCEP.setBounds(400, 100, 130, 30);

		JLabel ddEndere�o = new JLabel();
		ddEndere�o.setText("Endere�o:");
		ddEndere�o.setBounds(400, 160, 130, 30);

		JLabel ddNumero = new JLabel();
		ddNumero.setText("N�mero:");
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

		JTextField cdEndere�o = new JTextField();
		cdEndere�o.setBounds(400, 190, 250, 30);

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

		// Dados do Destinatario: Caixa de combina��o
		JComboBox<String> ddestadosLista = new JComboBox<String>();
		ddestadosLista.setBounds(400, 70, 250, 30);
		ddestadosLista.addItem("Acre");
		ddestadosLista.addItem("Alagoas");
		ddestadosLista.addItem("Amap�");
		ddestadosLista.addItem("Amazonas");
		ddestadosLista.addItem("Bahia");
		ddestadosLista.addItem("Cear�");
		ddestadosLista.addItem("Distrito Federal");
		ddestadosLista.addItem("Goi�s");
		ddestadosLista.addItem("Esp�rito Santo");
		ddestadosLista.addItem("Maranh�o");
		ddestadosLista.addItem("Mato Grosso");
		ddestadosLista.addItem("Mato Grosso do Sul");
		ddestadosLista.addItem("Minas Gerais");
		ddestadosLista.addItem("Par�");
		ddestadosLista.addItem("Paraiba");
		ddestadosLista.addItem("Paran�");
		ddestadosLista.addItem("Pernanbuco");
		ddestadosLista.addItem("Piau�");
		ddestadosLista.addItem("Rio de Janeiro");
		ddestadosLista.addItem("Rio Grande do Norte");
		ddestadosLista.addItem("Rio Grande do Sul");
		ddestadosLista.addItem("Rond�nia");
		ddestadosLista.addItem("Ror�ima");
		ddestadosLista.addItem("S�o Paulo");
		ddestadosLista.addItem("Santa Catarina");
		ddestadosLista.addItem("Sergipe");
		ddestadosLista.addItem("Tocantis");

		// Dados do Destinatario: Radio Button
		JRadioButton pequeno = new JRadioButton("Pequeno");
		pequeno.setBounds(10, 100, 130, 30);

		JRadioButton medio = new JRadioButton("M�dio");
		medio.setBounds(10, 130, 130, 30);

		JRadioButton grande = new JRadioButton("Grande");
		grande.setBounds(10, 160, 130, 30);

		// Dados do Destinatario: Agrupar botoes
		ButtonGroup bgTamanho = new ButtonGroup();
		bgTamanho.add(pequeno);
		bgTamanho.add(medio);
		bgTamanho.add(grande);

		// Encomenda: Bot�es do Formulario
		Encomenda.add(Descri��o);
		Encomenda.add(Tamanho);
		Encomenda.add(Peso);
		Encomenda.add(Valor);
		Encomenda.add(cDescri��o);
		Encomenda.add(cPeso);
		Encomenda.add(cValor);
		Encomenda.add(DadosDestinatario);
		Encomenda.add(ddBairro);
		Encomenda.add(ddCEP);
		Encomenda.add(ddCidade);
		Encomenda.add(ddComplemento);
		Encomenda.add(ddEndere�o);
		Encomenda.add(ddEstados);
		Encomenda.add(ddNumero);
		Encomenda.add(ddTelefone);
		Encomenda.add(cdBairro);
		Encomenda.add(cdCEP);
		Encomenda.add(cdCidade);
		Encomenda.add(cdComplemento);
		Encomenda.add(cdEndere�o);
		Encomenda.add(cdNumero);
		Encomenda.add(cdTelefone);
		Encomenda.add(ddestadosLista);
		Encomenda.add(pequeno);
		Encomenda.add(medio);
		Encomenda.add(grande);
		Encomenda.add(finalizar);
		Encomenda.add(voltar3);

		// Encomenda: Exibir Formulario
		Encomenda.setVisible(true);

		// Caminho: Interface
		JFrame Caminho = new JFrame();
		Caminho.setSize(1280, 720);
		Caminho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Caminho.setTitle("Sistema");
		Caminho.setLocationRelativeTo(null);
		Caminho.setLayout(null);

		// Caminho: Caixa de combina��o
		JComboBox<String> paCaminho = new JComboBox<String>();
		paCaminho.setBounds(10, 10, 1245, 50);
		paCaminho.addItem("Acre");

		// Caminho: Bot�es do Formulario
		Caminho.add(paCaminho);

		// Caminho: Exibir Formulario
		Caminho.setVisible(true);

		// Caminho: Interface
		JFrame HistoricoPedidos = new JFrame();
		HistoricoPedidos.setSize(1280, 720);
		HistoricoPedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HistoricoPedidos.setTitle("Sistema");
		HistoricoPedidos.setLocationRelativeTo(null);
		HistoricoPedidos.setLayout(null);

		// Dados do Destinatario: R�tulo
		JLabel hPedidos = new JLabel();
		hPedidos.setText("Hist�rco de Pedidos:");
		hPedidos.setBounds(10, 10, 1270, 50);

		// Caminho: Bot�es do Formulario
		HistoricoPedidos.add(hPedidos);

		// Caminho: Exibir Formulario
		HistoricoPedidos.setVisible(true);

	}

}

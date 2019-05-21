package prova01;

import javax.swing.JOptionPane;

public class Provas {

	public static void main(String[] args) {

		String nome, MaNome = " ", MeNome = " ";

		// Int Principais
		int login1 = 0, sexo1 = 0, idade = 0, qnt0 = 0, qntClientes = 0, idade1 = 0, idade2 = 0, idade3 = 0, idade4 = 0,
				ÁudioVídeo1 = 0, Informática1 = 0, Telefonia1 = 0, Vestuário1 = 0;

		// Int Secundarias
		int qnt1 = 0, qnt2 = 0, qnt3 = 0, qnt4 = 0, qnt5 = 0, qnt6 = 0, qnt7 = 0, qnt8 = 0, qnt9 = 0, qnt10 = 0,
				qnt11 = 0, qnt12 = 0, qnt13 = 0, qnt14 = 0, qnt15 = 0, qnt16 = 0, qnt17 = 0, qnt18 = 0, qnt19 = 0,
				qnt20 = 0, qnt21 = 0, qnt22 = 0, qnt23 = 0, qnt24 = 0;

		// tvs = Televisões, ads = Aparelhos de Som, hwr = Hardware, swr = Software, smp
		// = Smartphones, tbt = Tablets, mas = Masculino, fem = Feminino.
		double tvs1 = 0, tvs2 = 0, tvs3 = 0, ads1 = 0, ads2 = 0, ads3 = 0, hwr1 = 0, hwr2 = 0, hwr3 = 0, swr1 = 0,
				swr2 = 0, swr3 = 0, smp1 = 0, smp2 = 0, smp3 = 0, tbt1 = 0, tbt2 = 0, tbt3 = 0, mas1 = 0, mas2 = 0,
				mas3 = 0, fem1 = 0, fem2 = 0, fem3 = 0, qMas = 0, qFem = 0, pMas = 0, pFem = 0, MaGastou = 0,
				MeGastou = 0, total = 0;

		// Opções dos botões.
		Object[] login = { "Sim", "Não" };
		Object[] sexo = { "Masculino", "Feminino" };
		Object[] dep = { "Áudio/Vídeo", "Informática", "Telefonia", "Vestuário" };
		Object[] ÁudioVídeo = { "TVs", "Aparelhos de Som", "Voltar" };
		Object[] TVs = { "Smart TV Led 49 Samsung - R$ 4.999,99", "Smart TV 4k LG 60 - R$7.499,00",
				"Smart TV Full HD 32 Samsung - R$ 1.710,00", "Voltar" };
		Object[] AparelhosdeSom = { "Semp Toshiba Áudio Bright - R$ 599,99", "Mini System LG - R$ 512,00",
				"Mini System Philco - R$ 499,99 ", "Voltar" };
		Object[] Informática = { "Hardware", "Software", "Voltar" };
		Object[] Hardware = { "Placa Mãe Asus - R$ 2.000,00", "Memória Ram Corsair 4GB - R$500,00",
				"Mouse Multilaser - R$59,90", "Voltar" };
		Object[] Software = { "Windows 10  - R$500,00", "Office 2019   - R$399,99", "AutoCad 3D - R$899,50", "Voltar" };
		Object[] Telefonia = { "Smartphones", "Tablets", "Voltar" };
		Object[] Smartphones = { "Galaxy s9", "iPhone X", "MotoG 6", "Voltar" };
		Object[] Tablets = { "Galaxy Tab A", "M10A Lite", "iPad 6", "Voltar" };
		Object[] Vestuário = { "Masculino", "Feminino", "Voltar" };
		Object[] Masculino = { "Camisa Social Lacoste - R$ 200,00", "Calça Jeans Calvin Klein R$ 230,00",
				"Camisa Social Dudalina - R$ 130,00", "Voltar" };
		Object[] Feminino = { "Camisa Social Dudalina - R$170,00", "Calça Jeans Miss Masi - R$ 99,90",
				"Bermuda Dijean - R$ 74,40", "Voltar" };
		Object[] forma = { "a Vista", "a Prazo" };

		// Login inicial.
		login1 = JOptionPane.showOptionDialog(null, "Você deseja usar este Sistema", "Sistema",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, login, login[0]);
		if (login1 == 1) {
			JOptionPane.showMessageDialog(null, "Não foi realizada nenhuma venda");
		} else {

			// Dados do cliente
			nome = (JOptionPane.showInputDialog("Qual o seu nome?"));
			sexo1 = JOptionPane.showOptionDialog(null, "Qual o seu sexo?", "Sistema", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, sexo, sexo[0]);
			if (sexo1 == 0) {
				qMas++;
			} else
				qFem++;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));

			// Ciclo de perguntas
			while (login1 == 0) {

				int dep1 = JOptionPane.showOptionDialog(null, "Selecione um departamento", "Sistema",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, dep, dep[0]);

				// Departamento 1 = Áudio/Vídeo
				if (dep1 == 0) {
					ÁudioVídeo1 = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Sistema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, ÁudioVídeo,
							ÁudioVídeo[0]);
					if (ÁudioVídeo1 == 0) {
						int TVs1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, TVs, TVs[0]);
						if (TVs1 == 0) {
							tvs1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt1 = qnt0;
						} else if (TVs1 == 1) {
							tvs2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt2 = qnt0;
						} else if (TVs1 == 2) {
							tvs3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt3 = qnt0;
						}

					} else if (ÁudioVídeo1 == 1) {
						int AparelhosdeSom1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado",
								"Sistema", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
								AparelhosdeSom, AparelhosdeSom[0]);
						if (AparelhosdeSom1 == 0) {
							ads1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt4 = qnt0;
						} else if (AparelhosdeSom1 == 1) {
							ads2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt5 = qnt0;
						} else if (AparelhosdeSom1 == 2) {
							ads3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt6 = qnt0;
						}

					}
					ÁudioVídeo1++;

					// Departamento 2 = Informática
				} else if (dep1 == 1) {
					Informática1 = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Sistema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Informática,
							Informática[0]);
					if (Informática1 == 0) {
						int Hardware1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Hardware,
								Hardware[0]);
						if (Hardware1 == 0) {
							hwr1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt7 = qnt0;
						} else if (Hardware1 == 1) {
							hwr2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt8 = qnt0;
						} else if (Hardware1 == 2) {
							hwr3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt9 = qnt0;
						}

					} else if (Informática1 == 1) {
						int Software1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Software,
								Software[0]);
						if (Software1 == 0) {
							swr1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt10 = qnt0;
						} else if (Software1 == 1) {
							swr2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt11 = qnt0;
						} else if (Software1 == 2) {
							swr3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt12 = qnt0;
						}
					}
					Informática1++;

					// Departamento 3 = Telefonia
				} else if (dep1 == 2) {
					Telefonia1 = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Sistema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Telefonia, Telefonia[0]);
					if (Telefonia1 == 0) {
						int Smartphones1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Smartphones,
								Smartphones[0]);
						if (Smartphones1 == 0) {
							smp1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt13 = qnt0;
						} else if (Smartphones1 == 1) {
							smp2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt14 = qnt0;
						} else if (Smartphones1 == 2) {
							smp3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt15 = qnt0;
						}

					} else if (Telefonia1 == 1) {
						int Tablets1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Tablets, Tablets[0]);
						if (Tablets1 == 0) {
							tbt1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt16 = qnt0;
						} else if (Tablets1 == 1) {
							tbt2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt17 = qnt0;
						} else if (Tablets1 == 2) {
							tbt3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt18 = qnt0;
						}
					}
					Telefonia1++;

					// Departamento 4 = Vestuário
				} else if (dep1 == 3) {
					Vestuário1 = JOptionPane.showOptionDialog(null, "Selecione uma das opções", "Sistema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Vestuário, Vestuário[0]);
					if (Vestuário1 == 0) {
						int Masculino1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Masculino,
								Masculino[0]);
						if (Masculino1 == 0) {
							mas1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt19 = qnt0;
						} else if (Masculino1 == 1) {
							mas2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt20 = qnt0;
						} else if (Masculino1 == 2) {
							mas3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt21 = qnt0;
						}

					} else if (Vestuário1 == 1) {
						int Feminino1 = JOptionPane.showOptionDialog(null, "Selecione o produto desejado", "Sistema",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, Feminino,
								Feminino[0]);
						if (Feminino1 == 0) {
							fem1++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt22 = qnt0;
						} else if (Feminino1 == 1) {
							fem2++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt23 = qnt0;
						} else if (Feminino1 == 2) {
							fem3++;
							qnt0 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada"));
							qnt24 = qnt0;
						}

					}
					Vestuário1++;

				}
				qntClientes++;

				login1 = JOptionPane.showOptionDialog(null, "Você deseja continuar usando este Sistema", "Sistema",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, login, login[0]);
				login1 = JOptionPane.showOptionDialog(null, "Mais algum cliente deseja realizar alguma compra?",
						"Sistema", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, login, login[0]);

				// Calculo dos que mais gastou e que menos gastou
				total = tvs1 + tvs2 + tvs3 + ads1 + ads2 + ads3 + hwr1 + hwr2 + hwr3 + swr1 + swr2 + swr3 + smp1 + smp2
						+ smp3 + tbt1 + tbt2 + tbt3 + mas1 + mas2 + mas3 + fem1 + fem2 + fem3;
				if (total > MaGastou) {
					MaGastou = total;
					MaNome = nome;
				}
				if (total > MeGastou) {
					MeGastou = total;
					MeNome = nome;
				}
			}

			// Valores dos produtos por setor
			// Áudio/Vídeo
			tvs1 = 4999.99;
			tvs2 = 7499.00;
			tvs3 = 1710.00;
			ads1 = 599.99;
			ads2 = 512;
			ads3 = 499.99;
			// Informática
			hwr1 = 2000.00;
			hwr2 = 500.00;
			hwr3 = 59.90;
			swr1 = 500.00;
			swr2 = 399.90;
			swr3 = 899.50;
			// Telefonia
			smp1 = 2000.00;
			smp2 = 4400.00;
			smp3 = 899.00;
			tbt1 = 579.40;
			tbt2 = 629.00;
			tbt3 = 2279.05;
			// Vestuário
			mas1 = 200.00;
			mas2 = 230.00;
			mas3 = 130.00;
			fem1 = 170.00;
			fem2 = 99.90;
			fem3 = 74.40;

			// Valores multiplicados por unidades compradas
			tvs1 *= qnt1;
			tvs2 *= qnt2;
			tvs3 *= qnt3;
			ads1 *= qnt4;
			ads2 *= qnt5;
			ads3 *= qnt6;
			hwr1 *= qnt7;
			hwr2 *= qnt8;
			hwr3 *= qnt9;
			swr1 *= qnt10;
			swr2 *= qnt11;
			swr3 *= qnt12;
			smp1 *= qnt13;
			smp2 *= qnt14;
			smp3 *= qnt15;
			tbt1 *= qnt16;
			tbt2 *= qnt17;
			tbt3 *= qnt18;
			mas1 *= qnt19;
			mas2 *= qnt20;
			mas3 *= qnt21;
			fem1 *= qnt22;
			fem2 *= qnt23;
			fem3 *= qnt24;

			// Forma de pagamento
			int forma1 = JOptionPane.showOptionDialog(null, "Selecione a forma de pagamento", "Sistema",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, forma, forma[0]);
			if (forma1 == 0) {
				tvs1 *= 0.95;
				tvs2 *= 0.95;
				tvs3 *= 0.95;
				ads1 *= 0.95;
				ads2 *= 0.95;
				ads3 *= 0.95;
				hwr1 *= 0.90;
				hwr2 *= 0.90;
				hwr3 *= 0.90;
				swr1 *= 0.90;
				swr2 *= 0.90;
				swr3 *= 0.90;
				smp1 *= 0.85;
				smp2 *= 0.85;
				smp3 *= 0.85;
				tbt1 *= 0.85;
				tbt2 *= 0.85;
				tbt3 *= 0.85;
				mas1 *= 0.80;
				mas2 *= 0.80;
				mas3 *= 0.80;
				fem1 *= 0.80;
				fem2 *= 0.80;
				fem3 *= 0.80;
			} else {
			}

			// Idade dos clientes
			if (idade <= 17) {
				idade1++;
			} else if (idade <= 30) {
				idade2++;
			} else if (idade <= 50) {
				idade3++;
			} else if (idade > 50) {
				idade4++;
			} else {
			}

			// Porcentagem de Homens e Mulheres
			pMas = (qMas / qntClientes) * 100;
			pFem = (qFem / qntClientes) * 100;

			JOptionPane.showMessageDialog(null,
					"O compragor que mais gastou foi:" + MaNome + "\nO valor gasto foi = " + MaGastou);
			JOptionPane.showMessageDialog(null,
					"O compragor que menos gastou foi:" + MeNome + "\nO valor gasto foi = " + MeGastou);

			JOptionPane.showMessageDialog(null,
					"Quantidade de clientes que utilizaram o sistema: " + qntClientes + "\nQuantidade de Homens: "
							+ qMas + " " + pMas + "%" + "\nQantidade de Mulheres: " + qFem + " " + pFem + "%"
							+ "\nClientes até 17 anos: " + idade1 + "\nClientes entre 18 e 30 anos: " + idade2
							+ "\nClientes entre 31 e 50 anos: " + idade3 + "\nClientes acima dos 50 anos: " + idade4
							+ "\nQuantidade de pordutos vendidos do departamento de Áudio/Vídeo: " + ÁudioVídeo1
							+ "\nQuantidade de pordutos vendidos do departamento de Informática: " + Informática1
							+ "\nQuantidade de pordutos vendidos do departamento de Telefonia : " + Telefonia1
							+ "\nQuantidade de pordutos vendidos do departamento de Vestuário : " + Vestuário1);

		}

	}

}
package be.edu.univas.main;

import java.util.Scanner;
import br.edu.univas.vo.Receita;

public class StartApp {
	public static Scanner leitura = new Scanner(System.in);

	public static void main(String[] args) {

		Receita[] receitas = new Receita[1000];
		int contador = 0;
		int escolha = 0;
		do {
			imprimeMenu();

			escolha = leitura.nextInt();
			leitura.nextLine();

			if (escolha == 1) {

				cadastrarReceitas(receitas, contador);
				contador++;

			}

			else if (escolha == 2) {

				editarReceita(receitas);

			}

			else if (escolha == 3) {

				deletarReceita(receitas);

			}

			else if (escolha == 4) {

				mostrarReceitas(receitas);

			}

		} while (escolha != 9);

		System.out.println("Até Mais!");

	}

	public static void imprimeMenu() {

		System.out.println("Cadastro de Receitas");
		System.out.println();
		System.out.println("1 - Cadastrar Receita");
		System.out.println("2 - Editar Receita ");
		System.out.println("3 - Excluir Receita ");
		System.out.println("4 - Ver Receitas ");
		System.out.println("9 - Sair ");

	}

	public static void cadastrarReceitas(Receita[] receitas, int indice) {

		Receita receita = new Receita();
		System.out.println("Cadastro de Receitas:");
		System.out.println();
		System.out.println("Digite o nome do Paciente");
		receita.paciente = leitura.nextLine();
		System.out.println("Olho Direito:");
		System.out.println("Digite o grau esférico do olho direito: ");
		receita.ODesf = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o grau cilíndrico do olho direito: ");
		receita.ODcil = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o eixo do olho direito: ");
		receita.ODeixo = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Olho Esquerdo:");
		System.out.println("Digite o grau esférico do olho esquerdo: ");
		receita.OEesf = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o grau cilíndrico do olho esquerdo: ");
		receita.OEcil = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o eixo do olho esquerdo: ");
		receita.OEeixo = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Digite a adição:");
		receita.adc = leitura.nextDouble();
		leitura.nextLine();
		System.out.println();
		System.out.println("Receita cadastrada!");
		receitas[indice] = receita;

	}

	public static void mostrarReceitas(Receita[] receitas) {
		int num = 0;
		System.out.println("Pacientes Cadastrados: ");

		for (int i = 0; i < 1000; i++) {

			if (receitas[i] != null) {
				System.out.println("Paciente " + (i + 1) + ": " + receitas[i].paciente);
			}
		}

		System.out.println("Digite o número do paciente:");
		num = leitura.nextInt();

		System.out.println(receitas[num - 1].paciente);
		System.out.println();
		System.out.println("OD - Esf: " + receitas[num - 1].ODesf + "  Cil: " + receitas[num - 1].ODcil + "  Eixo: "
				+ receitas[num - 1].ODeixo);
		System.out.println("OE - Esf: " + receitas[num - 1].OEesf + "  Cil: " + receitas[num - 1].OEcil + "  Eixo: "
				+ receitas[num - 1].OEeixo);
		System.out.println("Adição: " + receitas[num - 1].adc);

	}

	public static void editarReceita(Receita[] receitas) {

		int choice = 0;

		System.out.println("Editar receitas:");

		System.out.println("Pacientes Cadastrados: ");

		for (int i = 0; i < 1000; i++) {

			if (receitas[i] != null) {
				System.out.println("Paciente " + (i + 1) + ": " + receitas[i].paciente);
			}

		}

		System.out.println("Digite o número da receita que deseja editar:");
		choice = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Digite o nome do Paciente");
		receitas[choice - 1].paciente = leitura.nextLine();
		System.out.println("Olho Direito:");
		System.out.println("Digite o grau esférico do olho direito: ");
		receitas[choice - 1].ODesf = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o grau cilíndrico do olho direito: ");
		receitas[choice - 1].ODcil = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o eixo do olho direito: ");
		receitas[choice - 1].ODeixo = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Olho Esquerdo:");
		System.out.println("Digite o grau esférico do olho esquerdo: ");
		receitas[choice - 1].OEesf = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o grau cilíndrico do olho esquerdo: ");
		receitas[choice - 1].OEcil = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o eixo do olho esquerdo: ");
		receitas[choice - 1].OEeixo = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Digite a adição:");
		receitas[choice - 1].adc = leitura.nextDouble();
		leitura.nextLine();
		System.out.println();
		System.out.println("Edição Concluída1");

	}

	public static void deletarReceita(Receita[] receitas) {
		int n = 0;
		System.out.println("Excluir receita:");

		System.out.println("Pacientes Cadastrados: ");

		for (int i = 0; i < 1000; i++) {

			if (receitas[i] != null) {
				System.out.println("Paciente " + (i + 1) + ": " + receitas[i].paciente);
			}
		}

		System.out.println("Digite o número da receita que deseja excluir:");

		n = leitura.nextInt();
		leitura.nextLine();

		receitas[n - 1] = null;

		System.out.println("Receita Excluida!");

	}
}

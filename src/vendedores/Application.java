package vendedores;

import template.Vendedor;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	static Vendedor[] vet;

	public static void main(String args[]) {
		int opc = 0, sair = 0;

		try (Scanner in = new Scanner(System.in)) {
			vet = new Vendedor[4];
			for (;;) {

				System.out.println();
				System.out.println("----------------------");
				System.out.println("Entre com uma opcao");
				System.out.println("1-Cadastrar um vendedor");
				System.out.println("2-Localizar um Vendedor");
				System.out.println("3-Listar Vendedor");
				System.out.println("4-Sair");
				System.out.print("opção: ");
				opc = in.nextInt();

				switch (opc) {
				case 1:

					while (sair != 1) {
						System.out.println("Por onde quer começar a Cadastrar? ");
						System.out.println("1 - Vendedor da Loja \n2 - Vendedor Externo");
						System.out.println("opção: ");
						opc = in.nextInt();

						if (opc == 1) {

							for (int i = 0; i < 2; i++) {

								in.nextLine();
								System.out.println("Nome do Vendedor da Loja " + (i + 1) + ": ");
								String nome = in.nextLine();

								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								double vendas = in.nextDouble();

								System.out.println("Digite a comissão do vendedor: ");
								double comissao = in.nextDouble();

								System.out.println("Digite o salario do vendedor: ");
								double salario = in.nextDouble();

								System.out.println("Digite a hora extra do vendedor: ");
								double horaExtra = in.nextDouble();

								vet[i] = new VendedorLoja(nome, vendas, comissao, salario, horaExtra);

							}
						}
						if (opc == 2) {
							for (int i = 2; i < 4; i++) {

								in.nextLine();

								System.out.println("Nome do Vendedor Externo " + (i + 1) + ": ");
								String nome = in.nextLine();

								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								double vendas = in.nextDouble();

								System.out.println("Digite a comissão do vendedor: ");
								double comissao = in.nextDouble();

								System.out.println("Digite a ajuda de custo do vendedor: ");
								double ajudaCusto = in.nextDouble();

								vet[i] = new VendedorExterno(nome, vendas, comissao, ajudaCusto);
							}
						}

						System.out.println("1 - Menu Principal");
						System.out.println("2 - Continuar cadastrando");
						System.out.println("Opção: ");
						sair = in.nextInt();
					}
					break;
				case 2:

					Vendedor vet2 = null;

					System.out.println("Qual Vendedor você quer Cadastrar para ser localizado? ");
					System.out.println("1 - Vendedor da Loja \n 2 - Vendedor Externo");
					System.out.println("opção: ");
					opc = in.nextInt();

					if (opc == 1) {

						in.nextLine();
						System.out.println("Nome do Vendedor Loja a Localizar: ");
						String nome = in.nextLine();

						System.out.println("Digite a quantidade de vendas do Vendedor: ");
						double vendas = in.nextDouble();

						System.out.println("Digite a comissão do vendedor: ");
						double comissao = in.nextDouble();

						System.out.println("Digite o salario do vendedor: ");
						double salario = in.nextDouble();

						System.out.println("Digite a hora extra do vendedor: ");
						double horaExtra = in.nextDouble();

						vet2 = new VendedorLoja(nome, vendas, comissao, salario, horaExtra);

					}
					if (opc == 2) {

						in.nextLine();
						System.out.println("Nome do Vendedor Externo a Localizar: ");
						String nome = in.nextLine();

						System.out.println("Digite a quantidade de vendas do Vendedor: ");
						double vendas = in.nextDouble();

						System.out.println("Digite a comissão do vendedor: ");
						double comissao = in.nextDouble();

						System.out.println("Digite a ajuda de custo do vendedor: ");
						double ajudaCusto = in.nextDouble();

						vet2 = new VendedorExterno(nome, vendas, comissao, ajudaCusto);

					}

					for (int i = 0; i < vet.length; i++) {

						if (vet2.equals(vet[i])) {
							System.out.println("Nome do vendedor encontrado é : " + vet[i].getNome());
							return;
						}

					}
					System.out.println("Não encontrado");
					break;

				case 3:
					Arrays.sort(vet);
					ListarVendedores.listarVendedores(vet);

					break;
				case 4:
				}
			}
		}

		catch (InputMismatchException a) {
			System.out.println("Erro na entrada de Dados!!!");
			System.exit(0);
		}

	}

	public Vendedor[] getVet() {
		return vet;
	}

	public void setVet(Vendedor[] vet) {
		Application.vet = vet;
	}

}
package vendedores;

import template.Vendedor;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	private static Vendedor[] vet;

	public static void main(String args[]) {
		int l = 0, e = 0, c = 0, opc = 0, sair = 0;
		VendedorLoja vl;
		VendedorExterno ve;
		try (Scanner in = new Scanner(System.in)) {
			vet = new Vendedor[10];
			while (opc != 4) {
				
				while ((opc != 1) && (opc != 2) && (opc != 3) && (opc != 4)) {
					System.out.println();
					System.out.println("----------------------");
					System.out.println("Entre com uma opcao");
					System.out.println("1-Cadastrar um vendedor");
					System.out.println("2-Localizar um Vendedor");
					System.out.println("3-Listar Vendedor");
					System.out.println("4-Sair");
					System.out.print("opção: ");
					opc = in.nextInt();
				}
				switch (opc) {
				case 1:
					while (sair != 1) {
						System.out.println("Qual Vendedor você quer Cadastrar? ");
						System.out.println("1 - Vendedor da Loja \n 2 - Vendedor Externo");
						System.out.println("opção: ");
						opc = in.nextInt();

						if (opc == 1) {
							if (l < 5) {
								vl = new VendedorLoja();
								System.out.println("Digite o nome do Vendedor da Loja: ");
								vl.setNome(in.nextLine());
								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								vl.setVendas(in.nextDouble());
								System.out.println("Digite a comissão do vendedor: ");
								vl.setComissao(in.nextDouble());

								System.out.println("Digite o salario do vendedor: ");
								vl.setSalario(in.nextDouble());

								System.out.println("Digite a hora extra do vendedor: ");
								vl.setHoraExtra(in.nextDouble());
															
								vet[c] = vl;
								l++;
								c++;
							} else {
								System.out.println("Quantidade maxima de vendedor loja atingida!");
							}
						}
						if (opc == 2) {
							if (e < 5) {
								ve = new VendedorExterno();
								System.out.println("Digite o nome do Vendedor Externo: ");
								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								System.out.println("Digite a comissão do vendedor: ");
								System.out.println("Digite a ajuda de custo salario do vendedor: ");
								e++;
								c++;
							} else {
								System.out.println("A quantidade maxima de vendedor loja é 5!");
							}
						}
						System.out.println("1 - Voltar");
						System.out.println("2 - Continuar cadastrando");
						System.out.println("Opção: ");
						sair = in.nextInt();
					}
					break;
				case 2:
					
					

					break;
				case 3:
					ListarVendedores listar  = new ListarVendedores();
					listar.toString();
					
					break;
				case 4:
				}
			}

		} catch (InputMismatchException a) {
			System.out.println("Erro de Entrada e saída!!!");
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

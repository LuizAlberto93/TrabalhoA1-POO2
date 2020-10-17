package vendedores;

import java.util.*;

import template.Vendedor;

public class ListarVendedores {

	public static void listarVendedores(ArrayList<Vendedor> listaDeVendedores) {
		Vendedor umVendedor = null;
		Collections.sort(listaDeVendedores);
	if (listaDeVendedores.isEmpty())
			System.out.println('\n' + "Nao ha Vendedores na lista.");
		else
			for (int i = 0; i < listaDeVendedores.size(); i++) {
				umVendedor = listaDeVendedores.get(i);
				if (umVendedor instanceof VendedorLoja) {
				umVendedor.toString();
				}	else if (umVendedor instanceof VendedorExterno) {
						umVendedor.toString();
			}
		}
	}

}

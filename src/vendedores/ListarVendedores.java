package vendedores;

import java.util.*;

import template.Vendedor;

public class ListarVendedores {

	public static void listarVendedores(ArrayList<Vendedor> listaDeVendedores) {
		Vendedor umVendedor = null;
		Collections.sort(listaDeVendedores);
		for (int i = 0; i < listaDeVendedores.size(); i++) {
			umVendedor = listaDeVendedores.get(i);
			if (umVendedor instanceof VendedorLoja) {
				toString(umVendedor);
			} else if (umVendedor instanceof VendedorExterno) {
				toString(umVendedor);
			}
		}
	}

}

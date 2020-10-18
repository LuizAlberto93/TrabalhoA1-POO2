package vendedores;

import template.Vendedor;

public class ListarVendedores {

	Vendedor[] fdp = new Vendedor[20];
	public static void listarVendedores(Vendedor[] fdp)
    {
        for (int i = 0; i < fdp.length; i++) {
            System.out.println();
            System.out.println(fdp[i]); // Chama o toString() criado nas classes
            System.out.println();
        }
    }
	

}

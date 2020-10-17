package vendedores;

import template.Vendedor;

public class ListarVendedores {

	
	public static void listarVendedores(Vendedor[] vet)
    {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.println(Application.vet[i]); // Chama o toString() criado nas classes
            System.out.println();
        }
    }
	

}

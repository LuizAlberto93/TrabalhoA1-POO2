package vendedores;


import template.Vendedor;

public class ListarVendedores {

	Vendedor[] vect = new Vendedor[20];
	public static void listarVendedores(Vendedor[] vect)
    {
		
        for (int i = 0; i < vect.length; i++) {
            System.out.println();
            System.out.println(vect[i]);
            System.out.println();
        }
    }
	

}

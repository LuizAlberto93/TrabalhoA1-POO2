package vendedores;

import template.Vendedor;

public class VendedorExterno extends Vendedor {

	private double ajudaCusto;

	public VendedorExterno() {
	}

	public VendedorExterno(String nome, double vendas, double comissao, double ajudaCusto) {
		this.setNome(nome);
		this.setVendas(vendas);
		this.setComissao(comissao);
		this.ajudaCusto = ajudaCusto;
		
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	public double calcularPagamento() {

		return ((vendas * comissao) + ajudaCusto);

	}
	
	public boolean equals(Object obj)
	{
		if (!(obj instanceof VendedorLoja))
		return false;
		VendedorLoja e = (VendedorLoja) obj;
		return this.calcularPagamento() == e.calcularPagamento();
	}

	@Override
	public String toString() {
		return " Vendedor Externo"
				+"\n Nome: " +nome
				+"\n Vendas: " + vendas
				+"\n Comissão: " +comissao
				+"\n Ajuda de Custo: " + ajudaCusto
				+"\n Total: " + calcularPagamento()
				+"\n -------------------------------";
	}

	
}
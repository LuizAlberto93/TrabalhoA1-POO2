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

	@Override
	public String toString() {
		return "VendedorExterno \n" + "nome: " + this.getNome();
	}
}
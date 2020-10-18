package vendedores;

import template.Vendedor;

public class VendedorLoja extends Vendedor {

	private double salario;
	private double horaExtra;

	public VendedorLoja() {

	}

	public VendedorLoja(String nome, double vendas, double comissao, double salario, double horaExtra) {
		this.setNome(nome);
		this.setVendas(vendas);
		this.setComissao(comissao);
		this.salario = salario;
		this.horaExtra = horaExtra;
				
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double calcularPagamento() {
		return ((vendas * comissao) + salario + horaExtra);
	}
	
	public boolean equals(Vendedor vet)
	{
		for (int i = 0; i <= vet.length; i++) {

			Object[] vet2;
			if (vet2[0].calcularPagamento() == vet[i].calcularPagamento()) {
				System.out.println("Nome do vendedor encontrado � : " + vet[i].getNome());

			}

		}
		
	}

	@Override
	public String toString() {
		return " Vendedor Loja"
				+"\n Nome: " +nome
				+"\n Salario: " + salario
				+"\n Comiss�o: " +comissao
				+"\n Hora Extra: " + horaExtra
				+"\n Total: " + calcularPagamento()
				+"\n -------------------------------";
	}

	
}
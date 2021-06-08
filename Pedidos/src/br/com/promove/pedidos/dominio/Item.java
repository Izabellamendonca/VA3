package br.com.promove.pedidos.dominio;

public class Item {
	
	private int codigo;
	private int quantidade;
	private double valorUnitario;
	private double valorDesconto;
	private Produto produto;
	
	public Item() {
		
	}
	
	public Item(int codigo, int quantidade, double valorUnitario, double valorDesconto, Produto produto) {
		this.setCodigo(codigo);
		this.setQuantidade(quantidade);
		this.setValorUnitario(valorUnitario);
		this.setValorDesconto(valorDesconto);
		this.setProduto(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double obterTotal(){
		return 1;
	}

	@Override
	public String toString() {
		return "Itens [codigo=" + codigo + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario
				+ ", valorDesconto=" + valorDesconto + "]";
	}

	
	
}

package br.com.promove.pedidos.dominio;

public class Produto {
	
	private int codigo;
	private String nome;
	private double valorCusto;
	private double valorVenda;
	private boolean ativo;
	private TipoMedida medida;
	
	public TipoMedida getMedida() {
		return medida;
	}

	public void setMedida(TipoMedida medida) {
		this.medida = medida;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double obterTotal(){
		return 1;
	}

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", nome=" + nome + ", valorCusto=" + valorCusto + ", valorVenda="
				+ valorVenda + ", ativo=" + ativo + "]";
	}
	
	
}

package br.com.promove.pedidos.dominio;

import java.util.ArrayList;

public class Pedido {

	private int codigo;
	private String dataCriacao;
	private String dataPrevisaoEntrega;
	private TipoStatus status;
	private Transportadora transportadora;
	private Endereco enderecoEntrega;
	private Cliente cliente;
	private ArrayList<Item> itens;
	
	public Pedido() {
		
	}
	
	
	public Pedido(int codigo, String dataCriacao, String dataPrevisaoEntrega, TipoStatus status,
			Transportadora transportadora, Endereco enderecoEntrega, Cliente cliente) {
		this.setCodigo(codigo);
		this.setDataCriacao(dataCriacao);
		this.setDataPrevisaoEntrega(dataPrevisaoEntrega);
		this.setStatus(status);
		this.setTransportadora(transportadora);
		this.setEnderecoEntrega(enderecoEntrega);
		this.setCliente(cliente);
	}
	
	
	public void adicionarItem(int codigo, int quantidade, double valorUnitario, double valorDesconto, Produto produto) {
		Item item = new Item(codigo,quantidade,valorUnitario,valorDesconto,produto);
		itens.add(item);
	}
	
	public ArrayList<Item> getItens(){
		return 	itens;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDataPrevisaoEntrega() {
		return dataPrevisaoEntrega;
	}

	public void setDataPrevisaoEntrega(String dataPrevisaoEntrega) {
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
	}

	public TipoStatus getStatus() {
		return status;
	}

	public void setStatus(TipoStatus status) {
		this.status = status;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

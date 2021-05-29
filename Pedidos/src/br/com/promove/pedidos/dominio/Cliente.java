package br.com.promove.pedidos.dominio;

public class Cliente {
	
	public Cliente(int codigo, String nome, String fone, String email, boolean ativo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.ativo = ativo;
	}
	
	private int codigo;
	private String nome;
	private String fone;
	private String email;
	private boolean ativo;
}

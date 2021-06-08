package br.com.promove.pedidos.dominio;

public class Transportadora {
	
	private int codigo;
	private String nome;
	private String fone;
	private String email;
	private boolean ativo;
	private Endereco endereco;
	
	public Transportadora() {
		this.setAtivo(true);
	}
	
	public Transportadora(int codigo, String nome, String fone, String email, Endereco endereco) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setFone(fone);
		this.setEmail(email);
		this.setAtivo(true);
		this.setEndereco(endereco);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Transportadora [codigo=" + codigo + ", nome=" + nome + ", fone=" + fone + ", email=" + email
				+ ", ativo=" + ativo + "]";
	}
	
	
}

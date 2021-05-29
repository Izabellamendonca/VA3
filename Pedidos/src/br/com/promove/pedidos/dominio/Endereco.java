package br.com.promove.pedidos.dominio;

public class Endereco {
	
	private String logradouro;
	private String cidade;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", cep=" + cep + "]";
	}
	
	
	
	
}

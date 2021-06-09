package br.com.promove.pedidos.dominio;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String cep;
	private TipoLogradouro tipoLogradouro;
	private TipoUF uf;

	public Endereco(String logradouro, String cidade, String cep, TipoLogradouro tipoLogradouro, TipoUF uf) {
		this.setLogradouro(logradouro);
		this.setCidade(cidade);
		this.setCep(cep);
		this.setTipoLogradouro(tipoLogradouro);
		this.setUf(uf);
	}

	public Endereco() {

	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public TipoUF getUf() {
		return uf;
	}

	public void setUf(TipoUF uf) {
		this.uf = uf;
	}

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
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", cep=" + cep + ", tipoLogradouro="
				+ tipoLogradouro + ", uf=" + uf + "]";
	}

}

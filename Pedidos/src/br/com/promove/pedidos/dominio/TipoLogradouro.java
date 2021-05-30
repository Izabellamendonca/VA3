package br.com.promove.pedidos.dominio;

public enum TipoLogradouro {

	Rua(1),
	Avenida(2),
	Alameda(3),
	Rodovia(4),
	Setor(5);
	
	private int tipoLogradouro;
	
	TipoLogradouro(int tipo) {
		this.tipoLogradouro = tipo;
	}
	
	public int getTipoMedida() {
		return this.tipoLogradouro;
	}
	
}

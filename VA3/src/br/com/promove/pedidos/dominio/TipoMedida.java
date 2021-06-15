package br.com.promove.pedidos.dominio;

public enum TipoMedida {

	Unidade(1), Caixa(2);

	private int tipoMedida;

	TipoMedida(int tipo) {
		this.tipoMedida = tipo;
	}

	public int getTipoMedida() {
		return this.tipoMedida;
	}
}

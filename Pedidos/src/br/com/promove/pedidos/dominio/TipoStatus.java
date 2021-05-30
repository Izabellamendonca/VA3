package br.com.promove.pedidos.dominio;

public enum TipoStatus {

	Criado(1),
	Pagamento(2),
	EmSepera�ao(3),
	NaTransportadora(4),
	Entregue(5);
	
	private int tipoStatus;
	
	TipoStatus(int tipo) {
		this.tipoStatus = tipo;
	}
	
	public int getTipoStaus() {
		return this.tipoStatus;
	}
	
}
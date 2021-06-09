package br.com.promove.pedidos.testes;

import br.com.promove.pedidos.dominio.Cliente;
import br.com.promove.pedidos.dominio.Endereco;
import br.com.promove.pedidos.dominio.Pedido;
import br.com.promove.pedidos.dominio.Produto;
import br.com.promove.pedidos.dominio.TipoLogradouro;
import br.com.promove.pedidos.dominio.TipoMedida;
import br.com.promove.pedidos.dominio.TipoUF;
import br.com.promove.pedidos.dominio.Transportadora;

public class Principal {

	public static void main(String[] args) {

		Produto produto1 = new Produto(3, "Notebook", 500, 1000, TipoMedida.Unidade);

		Produto produto2 = new Produto(3, "Placa de Vídeo", 50, 500, TipoMedida.Unidade);

		Endereco endereco1 = new Endereco("Rua Teste", "BH", "30122050", TipoLogradouro.Rua, TipoUF.MG);

		Transportadora transportadora1 = new Transportadora(2, "SEDEX", "(31) 965489521", "transportadora@gmail.com",
				endereco1);

		Cliente cliente1 = new Cliente(3, "Cliente Um", "(31) 912345678", "cliente1@gmail.com", endereco1);

		Pedido pedido1 = new Pedido(1, "08/06/2021", "10/06/2021", transportadora1, endereco1, cliente1);

		pedido1.adicionarItem(7, 10, 1000, 100, produto1);
		pedido1.adicionarItem(11, 10, 500, 50, produto2);

		System.out.print(pedido1.obterTotal());

	}

}

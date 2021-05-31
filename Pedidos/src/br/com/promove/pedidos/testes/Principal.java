package br.com.promove.pedidos.testes;

import br.com.promove.pedidos.dominio.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1,"Cliente Um","31987654321","cliente1@hotmail.com",true);
		Cliente cliente2 = new Cliente();
		
		cliente2.setCodigo(2);
		cliente2.setNome("Cliente Dois");
		cliente2.setFone("31912345678");
		cliente2.setEmail("cliente2@hotmail.com");
		cliente2.setAtivo(true);
		
		System.out.println(cliente1.toString()+"\n"+cliente2.toString());

	}

}

package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Joana");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.99, 10);
		
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Autobots", 1.99, 10);
		
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}
}

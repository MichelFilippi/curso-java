package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		
		compra1.cliente ="jjp";
		compra1.adicionarItem("Caneta", 10, 1.99);
		compra1.adicionarItem("Borracha", 8, 3.99);
		compra1.adicionarItem("Caderno", 2, 9.99);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
		
		
	}
	
}

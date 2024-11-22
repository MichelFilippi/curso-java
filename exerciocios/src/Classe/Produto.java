package Classe;

public class Produto {

	static double desconto= 0.25;
	public String nome;
	
	
	
	 static double precoFinal(double precoProduto) {
		return precoProduto*( 1-desconto);
	}
	
}





package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = false;
		boolean condicao2 = 3 > 7;
		boolean condicao3 = 4 > 5;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(!!condicao1);
		System.out.println(condicao3);
	}
}

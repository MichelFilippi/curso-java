package fundamentos;

import java.util.Scanner;

public class desafioConversão {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
			System.out.println("Quais foram seus ultimos salarios?");
				String salario1 = (entrada.nextLine());
				String salario2 = (entrada.nextLine());
				String salario3 = (entrada.nextLine());
			
				
				double dinheiro1 = Double.parseDouble(salario1);
				double dinheiro2 = Double.parseDouble(salario2);
				double dinheiro3 = Double.parseDouble(salario3);
				
				double soma = dinheiro1 + dinheiro2 + dinheiro3;
				double media = soma /3;
				System.out.println("A soma é "+ soma);
				System.out.println("A média é "+ media);
		
		entrada.close();
	}
}

package fundamentos;

import java.util.Scanner;

public class TipoString {
 

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite seu idade: ");
		String idade = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos. %n", 
				nome, sobrenome, idade);
		

		
		entrada.close();
		
		
	}
}

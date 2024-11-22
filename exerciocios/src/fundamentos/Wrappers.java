package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next());
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3.0);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		

		entrada.close();
	}
}

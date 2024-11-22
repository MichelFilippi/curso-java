package Colecoes;

import java.util.HashSet;

public class ConjuntoTorto {
	
	public static void main(String[] args) {
	
	HashSet conjunto = new HashSet();
	
	conjunto.add(1.2); //double ->  DoubleO
	conjunto.add(true); // boolean -> Boolean
	conjunto.add("Teste"); //String
	conjunto.add(1); // int -> Interger
	conjunto.add('x');
	
	System.out.println(conjunto.size());
	

	}
}

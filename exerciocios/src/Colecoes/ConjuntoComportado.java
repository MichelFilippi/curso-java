package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		SortedSet<String> listAprovado = new TreeSet<>();
		listAprovado.add("mundo");
		listAprovado.add("mundo2");
		listAprovado.add("mundo3");
		listAprovado.add("mundo4");
		listAprovado.add("mundo5");
		

	
	for(String mundo:listAprovado) {
		System.out.println(mundo);
	}
	
	
	}
}

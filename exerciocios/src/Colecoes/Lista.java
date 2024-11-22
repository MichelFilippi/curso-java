package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Jonas"));
		
		System.out.println(lista.get(0));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}

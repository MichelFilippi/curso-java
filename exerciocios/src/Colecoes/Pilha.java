package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros= new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("balabi");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		
		livros.size();
		livros.clear();
		livros.contains(livros);
	}
}

package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[4];
		notasAlunoA[0] = 8;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 8;
		notasAlunoA[3] = 7;
		
		
	
		System.out.println(Arrays.toString(notasAlunoA));
		double totalAlunoA = 0;
		for(int i =0; i<notasAlunoA.length;i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA/notasAlunoA.length);
		
		double notasAlunoB[] = {1.2,7,3.9,8.0};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
	
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}

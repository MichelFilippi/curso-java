package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		double n1 = 6;
		double n2 = 3 + 2;
		double n3 = 1-5;
		double n4 = 2-7;
		double n5 = 3*2;
		double n6 = 2;
		double n7 = 10;
		double e1 = 2;
		double e2 = 2;
		double e3 = 3;
		double e4 = 3;
		
		double Eq1 = n1*n2;
		double Eq2 = (n3*n4)/n6;
		
		double elEq1 = Math.pow(Eq1, e1);
		double elEq2 = Math.pow(Eq2,e2);
		
		double var1 = elEq1/n5;
		double var2 = elEq2;
		
		double Var = var1 - var2;
		double elVar = Math.pow(Var, e3);
	    double elDiv = Math.pow(n7, e4);
	    
	    double resultado = elVar / elDiv;
	    
	    System.out.println(resultado);
		
		
		
		
		
		
		
		
		
			
		
		
		
		
	}
}

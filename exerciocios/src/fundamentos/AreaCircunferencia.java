package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		final int ajuste = 32;
		final double  multiplicador = 5/9.0;
		double F = 110; 
		double C = ((F - ajuste) * multiplicador);
		
		double n = 6;
		double conta1 = n-1;
		double conta2 = n*conta1;
		double conta3 = conta2/2;
		
		System.out.println(C);
		
		System.out.println(conta3);
	}


} 

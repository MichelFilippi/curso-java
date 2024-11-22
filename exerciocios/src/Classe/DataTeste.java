package Classe;

public class DataTeste {

	
	public static void main(String[] args) {
		
		Data dt = new Data(1,1,1971);
		
		Data dt2 = new Data();
	
				
		
		System.out.println(dt.obterDataFormatada());
		
		dt2.imprimirDataFormada();
		dt.imprimirDataFormada();
		
		
		
	}
}

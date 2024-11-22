package Classe;

public class AreaCirc {
	double raio;
	static double  PI = 3.1415;
	
	
	double area() {
		return  PI * Math.pow(raio, 2);
	}
	public AreaCirc(double raioInicial){	
		raio= raioInicial;
	}
	
	static double area(double raio) {
		return PI*Math.pow(raio, 2);	
	}
}

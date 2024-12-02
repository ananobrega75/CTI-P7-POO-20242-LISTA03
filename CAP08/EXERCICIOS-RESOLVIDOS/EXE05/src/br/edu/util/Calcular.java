package br.edu.util;

public class Calcular {
	public static double reajuste(double antigo, double atual) {
		double resultado;
		
		resultado = (100*atual - 100*antigo)/antigo;
		return resultado;
		
}
}


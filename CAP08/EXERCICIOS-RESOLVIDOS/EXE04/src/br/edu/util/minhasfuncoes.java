package br.edu.util;

public class minhasfuncoes {
	public static void convi(double segundos) {

	double h, m, s, r;
	
	h = segundos/3600;
	r = segundos%3600;
	m = r/60;
	s = r%60;
	
	System.out.println("Equivale a: "+h+" horas");
	System.out.println(m+" minutos");
	System.out.println(s+" segundos");
		

	}

}

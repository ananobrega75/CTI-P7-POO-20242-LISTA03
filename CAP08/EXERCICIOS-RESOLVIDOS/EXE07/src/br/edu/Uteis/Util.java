package br.edu.Uteis;

public class Util {
	public static double calcula_media(double n1, double n2, double n3, char l) {
		double Media;
		if (l == 'A') {
			Media = (n1+n2+n3)/3;
		}
		else {
			Media = (n1*5+n2*3+n3*2)/(5+3+2);
		}
		return Media;

}
}



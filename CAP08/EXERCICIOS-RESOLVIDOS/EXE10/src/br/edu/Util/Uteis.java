package br.edu.Util;

public class Uteis {
	public static double sequencia(double Numero) {
		double A, B, F, Sequencia;
		Sequencia = 1;
		for (A=1;A<=Numero;A++) {
			F = 1;
			for (B=1;B<=A;B++) {
				F = F * B;
			}
			Sequencia = Sequencia + 1 /F;
		}
		return Sequencia;

}
}


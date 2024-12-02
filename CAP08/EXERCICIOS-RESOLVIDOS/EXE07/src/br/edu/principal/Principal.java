package br.edu.principal;
import java.util.Scanner;
import br.edu.Uteis.Util;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Nota_1, Nota_2, Nota_3, M;
		char letra= ' ';
		System.out.print("nota 1: ");
		Nota_1 = sc.nextDouble();
		System.out.print("nota 2: ");
		Nota_2 = sc.nextDouble();
		System.out.print("nota 3: ");
		Nota_3 = sc.nextDouble();
		do {
			System.out.print("letra: ");
			letra = sc.next().charAt(0);
		} while (letra != 'A'& letra != 'P');
		M = Util.calcula_media(Nota_1, Nota_2, Nota_3, letra);
		if (letra == 'A') {
			System.out.println("média de aritimética: "+M);
		}
		else {
			System.out.println("média que é ponderada: "+M);
		}
		sc.close();
	}
}


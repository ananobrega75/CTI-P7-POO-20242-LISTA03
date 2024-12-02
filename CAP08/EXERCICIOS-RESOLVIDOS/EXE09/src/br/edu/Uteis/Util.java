package br.edu.Uteis;
import java.util.Scanner;
public class Util {
		public static void maior_menor() {
			Scanner sc = new Scanner(System.in);
			double numero, maior=0, menor=0;
			for (int i = 1; i <= 5; i++) {
				System.out.print("número "+i+": ");
				numero = sc.nextDouble();	
				if (i == 1) {
					maior = numero;
					menor = numero;
				}
				else {
					if (numero > maior) {
						maior = numero;
					}
					if (numero < menor) {
						menor = numero;
					}
				}
			}
			System.out.print("\nMaior número: "+maior);
			System.out.print("\nMenor número: "+menor);
			sc.close();
		}


}



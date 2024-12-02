package br.edu.principal;
import java.util.Scanner;
import br.edu.Uteis.Util;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hora_i, Minutos_i, Horas_f, Minutos_f, Minutos;
		
		System.out.print("hora de inicio: ");
		Hora_i = sc.nextInt();
		System.out.print("minuto de inicio: ");
		Minutos_i = sc.nextInt();
		
		System.out.print("hora definal: ");
		Horas_f = sc.nextInt();
		System.out.print("minuto de fim: ");
		Minutos_f = sc.nextInt();
		
		Minutos = Util.calculo(Hora_i, Minutos_i, Horas_f, Minutos_f);
		System.out.print("\nminutos: "+Minutos);
		sc.close();
	}
}



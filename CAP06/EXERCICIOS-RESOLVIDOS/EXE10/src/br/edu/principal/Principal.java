package br.edu.principal;
import java.util.Scanner;
import br.edu.uteis.Util;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Numero, Sequencia;
		
		System.out.print("número: ");
		Numero = sc.nextDouble();		
		Sequencia = Util.sequencia(Numero);
		System.out.print("\nsequencia: "+Sequencia);
		sc.close();

	}

}

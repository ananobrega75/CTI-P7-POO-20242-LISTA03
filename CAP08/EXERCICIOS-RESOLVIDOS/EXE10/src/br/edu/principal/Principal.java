package br.edu.principal;
import java.util.Scanner;
import br.edu.Util.Uteis;
public class Principal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double Numero, Seq;
			
			System.out.print("número: ");
			Numero = sc.nextDouble();		
			Seq = Uteis.sequencia(Numero);
			System.out.print("\nsequencia: "+Seq);
			sc.close();

	}
	
}

package br.edu.principal;
import java.util.Scanner;
import br.edu.Uteis.Uteis;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("número: ");
			numero = sc.nextInt();
		} while (numero < 1 | numero > 9);
		
		Uteis.multiplicacao(numero);
		sc.close();
	}
}



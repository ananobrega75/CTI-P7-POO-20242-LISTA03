package br.edu.principal;
import java.util.Scanner;
import br.edu.util.minhasFuncoes;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, resultado;
		System.out.println("insira o valor que é de a: ");
		A = sc.nextInt();
		while (A<=0) {
			System.out.println("Insira o valor do a (maior ou igual a 1): ");
			A = sc.nextInt();
		}
		System.out.println("insira o valor do b: ");
		B = sc.nextInt();
		System.out.println("insira o valor do c: ");
		C = sc.nextInt();
		
		resultado = minhasFuncoes.divisores(A, B, C);
		
		System.out.println("Soma desses inteiros = "+resultado);
	}
}

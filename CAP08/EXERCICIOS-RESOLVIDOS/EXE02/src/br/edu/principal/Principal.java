package br.edu.principal;
import java.util.Scanner;
import br.edu.util.minhasFuncoes;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1, N2;
		
		System.out.println("insira o primeiro número que deseja: ");
		N1 = sc.nextInt();
		System.out.println("insira o segundo número que deseja: ");
		N2 = sc.nextInt();
		
		if (N2 < N1) {
			System.out.println("O primeiro número terá que ser maior.");
			return;
		}
		else if (N1==N2) {
			System.out.println("insira números que sejam diferentes");
		}
		else if (N2 == N1+1) {
			System.out.println("a soma dos números tá entre "+N1+" e "+N2+" é 0");
		}
		else {
			int result = minhasFuncoes.soma(N1, N2);
			System.out.println("A soma desses números tá entre "+N1+" e "+N2+" é "+result);
		}
	}
}


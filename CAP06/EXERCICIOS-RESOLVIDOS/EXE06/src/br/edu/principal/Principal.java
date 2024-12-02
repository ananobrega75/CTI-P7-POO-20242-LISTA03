package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		int I, J, AUX;
		for(I=0; I<10; I++) {
			System.out.println("insira o "+(I+1)+"º número: ");
			vetor[I] = sc.nextInt();
		}
		for(I=0; I<10; I++) {
			for(J=0; J< 9 - I; J++) {
				if(vetor[J] < vetor[J+1]) {
					AUX = vetor[J];
					vetor[J]= vetor[J+1];
					vetor[J+1]= AUX;
				}
			}
		}
		System.out.println("vetor em uma ordem decrescente:");
		for(I=0; I<10; I++) {
			System.out.println((I+1)+"º: " +vetor[I]+" ");	
		}

	}

}

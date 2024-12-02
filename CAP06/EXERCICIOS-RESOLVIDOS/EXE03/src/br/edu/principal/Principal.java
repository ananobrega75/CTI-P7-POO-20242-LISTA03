package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] vetor1 = new int[3];
		int [] vetor2 = new int[3];
		int [] vetor3 = new int[6];
		
		int J = 0;
			
		for (int i = 0; i < 3; i++) {
			System.out.println("faça um preenchimento do vetor 01: ");
			vetor1[i] = sc.nextInt();
			vetor3[J] = vetor1[i];
			J += 1;
			System.out.println("faça um preenchimento do vetor 02: ");	
			vetor2[i] =sc.nextInt();
			vetor3[J] = vetor2[i];
			J += 1;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(vetor3[i]);			
		}

	}

}

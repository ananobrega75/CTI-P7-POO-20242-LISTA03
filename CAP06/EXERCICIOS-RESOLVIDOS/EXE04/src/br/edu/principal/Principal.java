package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[8];
		int[] posicao = new int[8];
		int[] neg = new int[8];
		int cont_N = 1, cont_P = 1;
		for(int i = 1 ; i < 8; i++ ) {
			System.out.println("Insira o valor desse número: ");
			numero[i] = sc.nextInt();
			if(numero[i]>= 0) {
				posicao[cont_P] = numero[i];
				cont_P +=1;
				
			}
			else {
				neg[cont_N] = numero[i];
				cont_N +=1;				
			}
			
		}
		if(cont_N == 1) {
			System.out.println("vetores negativados e vazios: ");
			
		}
		else {
			for(int i = 1; i < cont_N - 1; i++) {
				System.out.println("Vetor de negativos que está vazio");
				System.out.println(neg[i]);	
			}
		}
		if(cont_P == 1) {
			System.out.println("Vetor de positivos que está vazio");
		}
		else {
			for(int i =1; i <cont_P; i++) {
				System.out.println(posicao[i]);
			
			}
		}

	}

}



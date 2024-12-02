package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] vetor = new int[8]; 
	        int I, J, Z, AUX;
	        I = 0; 
	        while (I < 8) {
	            System.out.println("Insira o " + (I + 1) + " número: ");
	            AUX = sc.nextInt();  
	            J = I - 1;  
	            while (J >= 0 && vetor[J] > AUX) {
	                J--;
	            }
	            Z = I;
	            while (Z > J + 1) {
	                vetor[Z] = vetor[Z - 1];
	                Z--;
	            }  
	            vetor[J + 1] = AUX;
	            I++;  
	        }
	        System.out.println("vetor ordenado de uma forma crescente:");
	        for (I = 0; I < 8; I++) {
	            System.out.print(vetor[I] + " ");
	        }

	}

}

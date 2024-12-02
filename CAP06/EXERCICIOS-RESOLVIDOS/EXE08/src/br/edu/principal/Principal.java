package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int[] X = new int[5];
	        int[] Y = new int[5];
	        int[] R = new int[10];
	        
	        int I, J, AUX;
	        
	        for (I = 0; I < 5; I++) {
	            System.out.println("Insira o " + (I + 1) + "o número para associar ao vetor X: ");
	            X[I] = sc.nextInt();
	        }

	        for (I = 0; I < 5; I++) {
	            for (J = 0; J < 4; J++) {
	                if (X[J] > X[J + 1]) {
	                    AUX = X[J];
	                    X[J] = X[J + 1];
	                    X[J + 1] = AUX;
	                }
	            }
	        }

	        for (I = 0; I < 5; I++) {
	            System.out.println("insira o " + (I + 1) + "o número para associar ao vetor Y: ");
	            Y[I] = sc.nextInt();
	        }

	        for (I = 0; I < 5; I++) {
	            for (J = 0; J < 4; J++) {
	                if (Y[J] > Y[J + 1]) {
	                    AUX = Y[J];
	                    Y[J] = Y[J + 1];
	                    Y[J + 1] = AUX;
	                }
	            }
	        }

	        int k = 0;
	        for (I = 0; I < 5; I++) {
	            R[k++] = X[I];
	            R[k++] = Y[I];
	        }

	        for (I = 0; I < 10; I++) {
	            for (J = 0; J < 9; J++) {
	                if (R[J] > R[J + 1]) {
	                	AUX = R[J];
	                    R[J] = R[J + 1];
	                    R[J + 1] = AUX;
	                }
	            }
	        }

	        System.out.print("Vetor X é ordenado: ");
	        for (I = 0; I < 5; I++) {
	            System.out.print(X[I] + " ");
	        }

	        System.out.print("\nVetor Y é ordenado: ");
	        for (I = 0; I < 5; I++) {
	            System.out.print(Y[I] + " ");
	        }

	        System.out.print("\nVetor R é ordenado: ");
	        for (I = 0; I < 10; I++) {
	            System.out.print(R[I] + " ");
	        }

	}

}

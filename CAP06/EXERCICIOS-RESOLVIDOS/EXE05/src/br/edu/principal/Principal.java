package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] X = new int[10];
	        int[] Y = new int[10];
	        int[] U = new int[20];
	        int[] D = new int[10];
	        int[] S = new int[10];
	        int[] P = new int[10];
	        int[] IT = new int[10];

	        int I = 0, J, K, cont_U, cont_D, cont_I;

	        for (J = 0; I < 10; I++) {
	            System.out.println("insira o valor que tem o vetor X: ");
	            X[I] = sc.nextInt();
	            System.out.println("insira o valor que tem o vetor Y: ");
	            Y[I] = sc.nextInt();
	        }
	        cont_U = 0;
	        cont_D = 0;
	        cont_I = 0;
	        for (I = 0; I < 10; I++) {
	            J = 0;
	            while (J < cont_U && X[I] != U[J]) {
	                J = J + 1;
	            }
	            if (J >= cont_U) {
	                U[cont_U] = X[I];
	                cont_U = cont_U + 1;
	            }
	        }

	        for (I = 0; I < 10; I++) {
	            J = 0;
	            while (J < cont_U && Y[I] != U[J]) {
	                J = J + 1;
	            }
	            if (J >= cont_U) {
	                U[cont_U] = Y[I];
	                cont_U = cont_U + 1;
	            }
	        }

	        System.out.println("\nElementos que são únicos foram encontrados (U):");
	        for (I = 0; I < cont_U; I++) {
	            System.out.print(U[I] + " ");
	        }

	        for (I = 0; I < 10; I++) {
	            J = 0;
	            while (J < 10 && X[I] != Y[J]) {
	                J = J + 1;
	            }
	            if (J >= 10) {
	                K = 0;
	                while (K < cont_D && X[I] != D[K]) {
	                    K = K + 1;
	                }
	                if (K >= cont_D) {
	                    D[cont_D] = X[I];
	                    cont_D = cont_D + 1;
	                }
	            }
	        }

	        System.out.println("\nElementos de X que não se fazem presentes em Y (D):");
	        for (I = 0; I < cont_D; I++) {
	            System.out.print(D[I] + " ");
	        }

	        for (I = 0; I < 10; I++) {
	            S[I] = X[I] + Y[I];
	            P[I] = X[I] * Y[I];
	        }

	        System.out.println("\nResultados dessas somas (S):");
	        for (I = 0; I < 10; I++) {
	            System.out.print(S[I] + " ");
	        }

	        System.out.println("\nResultados dessas multiplicações (P):");
	        for (I = 0; I < 10; I++) {
	            System.out.print(P[I] + " ");
	        }

	        for (I = 0; I < 10; I++) {
	            J = 0;
	            while (J < 10 && X[I] != Y[J]) {
	                I = J + 1;
	            }
	            if (J < 10) {
	                K = 0;
	                while (K < cont_I && IT[K] != X[I]) {
	                    K = K + 1;
	                }
	                if (K >= cont_I) {
	                    IT[cont_I] = X[I];
	                    cont_I = cont_I + 1;
	                }
	            }
	        }

	        System.out.println("\nElementos que são comuns entre X e Y (IT):");
	        for (I = 0; I < cont_I; I++) {
	            System.out.print(IT[I] + " ");
	        }

	}

}
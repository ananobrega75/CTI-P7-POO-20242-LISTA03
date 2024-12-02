package br.edu.util;

public class minhasFuncoes {
			public static int divisores(int a, int b, int c) {
				int I=0, S=0, R;
				
				for (I = b; I <= c; I++) {
					R = I%a;
					if (R==0) {
						S = S + I;
					}
				}
				return S;
			}
			

		}




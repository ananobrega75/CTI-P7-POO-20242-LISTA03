package br.edu.Uteis;

public class Uteis {
		public static void multiplicacao(int n) {
			int I, J;
			
			for (I=1;I<=n;I++) {
				
				for (J=1;J<=I;J++) {
					
					System.out.print(I*J+ "  ");
				}
				System.out.println();
			}

}
	}


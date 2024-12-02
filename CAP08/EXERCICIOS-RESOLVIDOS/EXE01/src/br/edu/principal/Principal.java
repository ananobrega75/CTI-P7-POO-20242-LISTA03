package br.edu.principal;
import java.util.Scanner;
import br.edu.util.minhasFuncoes;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero, X;		
		System.out.println("insira um número: ");
		numero = sc.nextDouble();
		X = minhasFuncoes.ver(numero);
		if (X == 1) {
			System.out.println("número é positivo");
		} else {
			System.out.println("número é negativo");
		}
		

	}

	}




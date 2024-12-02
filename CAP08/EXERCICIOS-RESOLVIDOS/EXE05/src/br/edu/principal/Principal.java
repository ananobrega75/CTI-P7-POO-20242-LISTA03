package br.edu.principal;
import java.util.Scanner;
import br.edu.util.Calcular;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco_antigo, preco_atual, acrescimo;
		
		System.out.println("Preço antigo que tem o produto: ");
		preco_antigo = sc.nextDouble();
		System.out.println("Preço atual que tem o produto: ");
		preco_atual = sc.nextDouble();
		acrescimo = Calcular.reajuste(preco_antigo, preco_atual);
		System.out.println("O percentual de acréscimo do novo preço em uma relção com o antigo será de "+acrescimo+"%");
		
	}

}
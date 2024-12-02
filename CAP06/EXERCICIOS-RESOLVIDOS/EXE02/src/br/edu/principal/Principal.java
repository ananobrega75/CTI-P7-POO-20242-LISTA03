package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] quantidade = new int[10];
		int[] preco = new int[10];
		int I ,total_geral= 0, total_venda, comissao, maior, ind;
		total_geral = 0;
		
		for(I = 1; I <10;I++ ) {
			System.out.println("Insira a quantidade: "+ (I+1)+ ": ");
			quantidade[I] = sc.nextInt();
			System.out.println("Insira o preço: "+(I+1)+ ": ");
			preco[I] = sc.nextInt();
		}
		for(I= 1;I<10;I++ ) {
			total_venda = quantidade[I] * preco[I];
			System.out.println("Totalalidade do item vendido " + (I + 1) + ": " + total_venda + " (quantidade: " + quantidade[I] + ", Preço: " + preco[I] + ")");
			total_geral = total_geral + total_venda;
		}
		comissao = total_geral * 5 /100;
		System.out.println("Totalidade geral de vendas: " + total_geral + " | Comissão: " + comissao);
		maior = quantidade[0];
		ind = 0;
		for(I = 1; I<10;I++ ) {
			if(quantidade[I] > maior) {
				maior = quantidade[I];
				ind = I;
			}
		}
		   System.out.println("O item que obteve a maior quantidade vendida " + (ind + 1) + " com a " + maior + " unidades, e seu preço vai ser " + preco[ind]);
		   sc.close();

	}
}
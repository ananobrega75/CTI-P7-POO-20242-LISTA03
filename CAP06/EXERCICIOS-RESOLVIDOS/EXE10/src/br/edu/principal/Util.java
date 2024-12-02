package br.edu.principal;
import java.util.Scanner;
public class Util {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pt, tl_ap = 0, PER_AP;
        String[] RES = new String[8];
        String[] GAB = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("insira a resposta dessa questão " + (i+1) + ":");
           GAB[i] = sc.nextLine();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("insira o número do " + (i+1) + "º aluno");
            n = sc.nextInt();
            sc.nextLine();
            pt = 0;
            
            for (int j = 0; j < 8; j++) {
                System.out.println("insira a resposta colocada pelo aluno " + n + " à " + (j+1) + "º questão");
                RES[j] = sc.nextLine();
                
                if (RES[j].equals(GAB[j])) {
                    pt++;
                }
            }
            
            System.out.println("a nota do aluno " + n + " será " + pt);
            
            if (pt >= 6) {
                tl_ap++;
            }
        }
        
        PER_AP = tl_ap * 100 / 10;
        System.out.println("O percentual de alunos aprovados vai ser " + PER_AP + "%");
    }

	public static double sequencia(double numero) {
		return 0;
	}
	}
package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        int[] Voo = new int[12];
	        String[] Origem = new String[12];
	        String[] Destino = new String[12];
	        int[] Lugares = new int[12];
	        int I, OP, OP2, numero_voo;
	        String local;
	        for (I = 0; I < 12; I++) {
	            System.out.println("insira o número de voo: ");
	            Voo[I] = sc.nextInt();
	            sc.nextLine();
	            System.out.println("Insira o local da origem: ");
	            Origem[I] = sc.nextLine();
	            System.out.println("Insira o local do destino: ");
	            Destino[I] = sc.nextLine();
	            System.out.println("Insira o número dos lugares que estão disponíveis: ");
	            Lugares[I] = sc.nextInt();
	        }

	        do {
	            System.out.println("01- consulta");
	            System.out.println("02- reserva");
	            System.out.println("03- finalizar");
	            System.out.print("insira uma das opções: ");
	            OP = sc.nextInt();

	            if (OP == 1) {
	                System.out.println("01- consulta pelo voo");
	                System.out.println("02- consulta pela origem");
	                System.out.println("03- consulta pelo destino");
	                System.out.print("insira a sua opção: ");
	                OP2 = sc.nextInt();
	                sc.nextLine();

	                if (OP2 == 1) {
	                    System.out.print("insira o número do voo: ");
	                    numero_voo = sc.nextInt();
	                    sc.nextLine();

	                    I = 0;
	                    while (I < 12 && Voo[I] != numero_voo) {
	                        I++;
	                    }

	                    if (I >= 12) {
	                        System.out.println("Voo não existe.");
	                    } else {
	                        System.out.println("número de voo: " + Voo[I]);
	                        System.out.println("local da origem: " + Origem[I]);
	                        System.out.println("local do destino: " + Destino[I]);
	                        System.out.println("Lugares disponíveis: " + Lugares[I]);
	                    }
	                }

	                if (OP2 == 2) {
	                    System.out.print("insira o local da origem: ");
	                    local = sc.nextLine();

	                    for (I = 0; I < 12; I++) {
	                        if (local.equals(Origem[I])) {
	                            System.out.println("número desse voo: " + Voo[I]);
	                            System.out.println("Local dessa origem: " + Origem[I]);
	                            System.out.println("Local desse destino: " + Destino[I]);
	                            System.out.println("lugares disponíveis: " + Lugares[I]);
	                        }
	                    }
	                }

	                if (OP2 == 3) {
	                    System.out.print("insira o local do destino: ");
	                    local = sc.nextLine();

	                    for (I = 0; I < 12; I++) {
	                        if (local.equals(Destino[I])) {
	                            System.out.println("número do voo: " + Voo[I]);
	                            System.out.println("local da origem: " + Origem[I]);
	                            System.out.println("local de destino: " + Destino[I]);
	                            System.out.println("lugares que estão disponíveis: " + Lugares[I]);
	                        }
	                    }
	                }
	            }

	            if (OP == 2) {
	                System.out.print("insira o número do voo que você deseja: ");
	                numero_voo = sc.nextInt();
	                sc.nextLine();

	                I = 0;
	                while (I < 12 && Voo[I] != numero_voo) {
	                    I++;
	                }

	                if (I >= 12) {
	                    System.out.println("Número de voo acabou não sendo encontrado.");
	                } else {
	                    if (Lugares[I] == 0) {
	                        System.out.println("voo está lotado.");
	                    } else {
	                        Lugares[I]--;
	                        System.out.println("reserva foi confirmada com sucesso");
	                    }
	                }
	            }
	        } while (OP != 3);

	        sc.close();
	        System.out.println("sistema foi finalizado com sucesso");
		
	}

}

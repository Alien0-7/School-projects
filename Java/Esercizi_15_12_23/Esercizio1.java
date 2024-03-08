package Esercizi_15_12_23;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int c = 0;
        int max;

        System.out.print("\nInserisci quanti numeri deve contenere l'array: ");
        max = scan.nextInt();
        int a[] = new int[max];
        System.out.print("+----------------- Numeri Generati -----------------+\n");

        for (int i = 0; i < max; i++){
            a[i]= random.nextInt(1,7);
            if (i < 10) {
                System.out.print("|                     a[" + i + "] = " + a[i] + "                      |");
                System.out.println();
            } else if (i < 100) {
                System.out.print("|                     a[" + i + "] = " + a[i] + "                     |");
                System.out.println();
            } else if (i < 1000) {
                System.out.print("|                     a[" + i + "] = " + a[i] + "                    |");
                System.out.println();
            }

            if (a[i] == 6){
                c++;
            }
        }
        System.out.print("+---------------------------------------------------+\n");

        System.out.println("Il numero 6 è uscito: " + c + " volte");

    }
}
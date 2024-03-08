package Esercizi_18_11_23;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h, b;

        System.out.print("Inserisci l'altezza del rettangolo: ");
        h = scan.nextInt();
        while (h <= 0){
            System.out.print("Il numero inserito non è valido!\nReinserire l'altezza del rettangolo: ");
            h = scan.nextInt();
        }

        System.out.print("Inserisci la base del rettangolo: ");
        b = scan.nextInt();
        while (b <= 0){
            System.out.print("Il numero inserito non è valido!\nReinserire la base del rettangolo: ");
            b = scan.nextInt();
        }

        for (int i = 1; i <= h; i++){
            for (int j = 1; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= h; i++){

            for (int j = 1; j <= b; j++){
                if (i == 1 || i == h) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == b) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
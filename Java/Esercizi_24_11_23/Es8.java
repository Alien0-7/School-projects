package Esercizi_24_11_23;

import java.util.Scanner;

public class Es8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int altezza;
        int base;

        System.out.println("Inserisci l'altezza (compresa tra 2 e 4): ");
        altezza = scanner.nextInt();

        while( altezza < 2 || altezza > 4){

            System.out.println("Valore non valido\nPer favore reinserisci l'altezza (compresa tra 2 e 4): ");
            altezza = scanner.nextInt();

        }

        System.out.println("Inserisci la base (compresa tra 4 e 8): ");
        base = scanner.nextInt();

        while( base < 4 || base > 8){

            System.out.println("Valore non valido\nPer favore reinserisci la base (compresa tra 4 e 8): ");
            base = scanner.nextInt();

        }

        for( int i = 1; i <= altezza; i ++){

            for( int j = 1; j <= base; j ++){

                System.out.print("* ");

            }

            System.out.println("");

        }

        System.out.println("");

        for( int i = 1; i <= altezza; i ++){

            for( int j = 1; j <= base; j ++){

                if( i == 1 || i == altezza || j == 1 || j == base) {

                    System.out.print("* ");

                }else{

                    System.out.print("  ");

                }

            }

            System.out.println("");

        }

    }
}

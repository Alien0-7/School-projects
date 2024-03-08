package Esercizi_24_11_23;

import java.util.Scanner;

public class Es2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int a;
        int b;
        double x;

        System.out.print("Inserisci a: ");
        a = scanner.nextInt();
        System.out.print("Inserisci b: ");
        b = scanner.nextInt();

        if ( a == 0 && b == 0){

            System.out.println("L'equazione è indeterminata");

        }else{

            if( a == 0){

                System.out.println("L'equazione è impossibile");

            }else{

                x = (double) -b/a;
                System.out.println("La soluzione della equazione è: " + x);

            }
        }

    }
}

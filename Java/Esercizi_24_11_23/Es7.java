package Esercizi_24_11_23;

import java.util.Random;

public class Es7 {
    public static void main(String[] args){

        Random random = new Random();

        int n;
        int num = 0;
        int somma = 0;

        while(somma <= 50){

            n = random.nextInt(10) + 1;

            num ++;

            somma = somma + n;

            System.out.println(n);

        }

        System.out.println("Sono stati generati " + num + " numeri");

    }
}

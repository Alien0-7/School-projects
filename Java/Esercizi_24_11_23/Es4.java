package Esercizi_24_11_23;

import java.util.Random;

public class Es4 {

    public static void main(String[] args){

        Random random = new Random();

        int n;
        int somma = 0;
        double media;

        for(int i = 1; i <= 10; i++){

            n = random.nextInt(6)+ 1;

            somma = somma + n;

            System.out.println(n);
        }

        media = (double) somma/10;

        System.out.println("La tua media è: " + media);

    }
}

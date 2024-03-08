package Esercizi_11_11_23;

import java.util.Random;

public class Esercizio1 {
    public static void main(String[] args){
        int dado, dado6 = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            dado = random.nextInt(6)+1;

            /*   Si può usare anche questa forma per dire che
             *   il numero casuale deve andare da 1 (incluso) fino a 7 (escluso)
             *
             *   dado = random.nextInt(1,7);
             */

            if (dado == 6){
                dado6++;
            }
            System.out.println("è uscito il numero " + dado);
        }

        System.out.println("\nIl numero 6 è uscito " + dado6 + " volta/e");
    }
}

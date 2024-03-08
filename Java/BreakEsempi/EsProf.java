package BreakEsempi;

import java.util.Random;

public class EsProf {
    public static void main(String[] args){

        //  break

        // dichiarazione di un numero casuale di tipo Random
        // Random casuale -> dichiara un oggetto chiamato casuale
        // new Random()  --> si crea l'oggetto che crea numeri casuali
        Random casuale = new Random();

        // uscire quando si genera il numero 3

        // simulare lancio del dado
        //		int x;
        //		for(int i=1; i<=100 ; i++) {
        //			x = casuale.nextInt(6)+1;
        //			System.out.print(x + " ");
        //			if(x==3)
        //				break;
        //		}


        int array[] = new int[20];
        int x;
        for(int i=0; i<20 ; i++)
            array[i] = casuale.nextInt(20)+1;

        for(int i=0; i<20 ; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // è presente il numero 10?
        // appena trovo il numero 10 esco!!!!
        int i;
        boolean trovato = false;
        for(i=0; i<20 ; i++) {
            System.out.print(array[i] + " ");
            if(array[i] == 10) {
                trovato = true;
                break;
            }
        }

        // e poi...
        if(trovato == true)
            System.out.println("Trovato all'indice " + i);
        else
            System.out.println("NON Trovato!");



        // attenzione questo codice NON funziona correttamente
        // se l'array NON contiene il numero 10
        //		if(array[i] == 10)
        //			System.out.println("Trovato all'indice " + i);
        //		else
        //			System.out.println("NON Trovato!");



        // nextInt(10) -> si genera un numero casuale  0 --> 9
        //		int x = casuale.nextInt(10);
        //
        //		System.out.println(x);

        //		int x;
        //
        //		for(int i=1; i<=10; i++) {
        //			x = casuale.nextInt(10);
        //			System.out.print(x + " ");
        //		}
        //



        // generare numeri casuali  -20 -> +40
        //
        // min = -20
        // max = + 40
        //
        // nextInt(max-min+1)  + min;
        // nextInt(40-(-20)+1) + (-20)

        //		int x;
        //
        //		for(int i=1; i<=10; i++) {
        //			x = casuale.nextInt(61) -20 ;
        //			System.out.print(x + " ");
        //		}


    }
}

package Esercizi_18_11_23;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m,n, nSomma = 0, mSomma = 0;

        System.out.print("Inserisci il primo numero: ");
        m = scan.nextInt();
        System.out.print("Inserisci il primo numero: ");
        n = scan.nextInt();

        while (!( nSomma == mSomma )){
            nSomma = nSomma + n;
            mSomma = mSomma + m;
        }

        System.out.println("Il minimo comune multiplo è " + nSomma);
    }
}

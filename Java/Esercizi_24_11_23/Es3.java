package Esercizi_24_11_23;

import java.util.Scanner;

public class Es3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ProvaScritta, ProvaPratica, ProvaOrale;
        double media;

        System.out.print("Inserisci il voto della prova scritta: ");
        ProvaScritta = scan.nextInt();
        while (ProvaScritta > 10 || ProvaScritta < 1){
            System.out.print("Il voto inserito non è valido\nReinserisci il voto della prova scritta: ");
            ProvaScritta = scan.nextInt();
        }

        System.out.print("Inserisci il voto della prova pratica: ");
        ProvaPratica = scan.nextInt();
        while (ProvaPratica > 10 || ProvaPratica < 1){
            System.out.print("Il voto inserito non è valido\nReinserisci il voto della prova pratica: ");
            ProvaPratica = scan.nextInt();
        }

        System.out.print("Inserisci il voto della prova orale: ");
        ProvaOrale = scan.nextInt();
        while (ProvaOrale > 10 || ProvaOrale < 1){
            System.out.print("Il voto inserito non è valido\nReinserisci il voto della prova orale: ");
            ProvaOrale = scan.nextInt();
        }

        media = (double) (ProvaScritta + ProvaOrale + ProvaPratica) /10;

        System.out.println("La media dei voti è: "+media);

    }
}

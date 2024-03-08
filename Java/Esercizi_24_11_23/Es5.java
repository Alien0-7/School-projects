package Esercizi_24_11_23;

import java.util.Scanner;

public class Es5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Inserisci il numero: ");
        n = scan.nextInt();

        while (n<11 || n>20){
            System.out.print("Numero inserito non valido!\nReinserisci il numero: ");
            n = scan.nextInt();
        }

        for (int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
}

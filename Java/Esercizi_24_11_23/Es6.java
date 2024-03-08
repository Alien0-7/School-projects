package Esercizi_24_11_23;

import java.util.Scanner;

public class Es6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1,n2;

        System.out.print("Inserisci il primo numero: ");
        n1 = scan.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        n2 = scan.nextInt();

        while(!(n1<n2)){
            System.out.println("Valori non validi!");
            System.out.print("Reinserisci il primo numero: ");
            n1 = scan.nextInt();

            System.out.print("Reinserisci il secondo numero: ");
            n2 = scan.nextInt();
        }
        for (int i = n1; i <= n2; i++){
            System.out.print(i + " ");
        }
    }
}

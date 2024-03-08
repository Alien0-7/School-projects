package Esercizi_24_11_23;

import java.util.Scanner;

public class Es1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Inserisci un numero: ");
        n = scan.nextInt();

        if (n > 0){
            System.out.println("Il numero inserito è positivo");
        } else if (n == 0) {
            System.out.println("Il numero inserito è 0");
        } else {
            System.out.println("Il numero inserito è negativo");
        }

    }
}

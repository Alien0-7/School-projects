package String;

import java.util.Scanner;

public class Stringhe {
    public static void main(String[] args){
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la stringa da stampare: ");
        s = scan.nextLine();

        System.out.println("Stringa MAIUSCOLA: " + s.toUpperCase());
        System.out.println("Stringa minuscola: " + s.toLowerCase());

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}

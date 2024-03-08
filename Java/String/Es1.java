package String;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args){
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la stringa da stampare: ");
        s = scan.nextLine();

        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println("\n");
        for (int i = s.length()-1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }
}

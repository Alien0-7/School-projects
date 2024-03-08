package String;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args){
        String s1,s2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        s1 = scan.nextLine();
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == (char) 32){
                s1 = s1.substring(0,i);
            }
        }
        System.out.print("Inserisci la seconda parola: ");
        s2 = scan.nextLine();
        for (int i = 0; i < s2.length(); i++){
            if (s2.charAt(i) == (char) 32){
                s2 = s2.substring(0,i);
            }
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Le due parole sono uguali!");
        } else {
            System.out.println("Le due parole non sono uguali!");
        }
    }
}

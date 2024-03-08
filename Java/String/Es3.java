package String;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;

        System.out.print("Inserisci la prima stringa: ");
        s = scan.nextLine();
        do{
            if (!s.equals("stop")) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == (char) 65 || s.charAt(i) == (char) 69 || s.charAt(i) == (char) 73 || s.charAt(i) == (char) 79 || s.charAt(i) == (char) 85 || s.charAt(i) == (char) 97 || s.charAt(i) == (char) 101 || s.charAt(i) == (char) 105 || s.charAt(i) == (char) 111 || s.charAt(i) == (char) 117) {
                        System.out.print("");
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println("");
                System.out.print("Inserisci una nuova stringa: ");
                s = scan.nextLine();
            }
        } while(!s.equals("stop"));
    }
}

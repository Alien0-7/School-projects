package Esercizi_1_12_23;

import java.util.Scanner;

public class Stringhe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "Ciao oggi è una bella giornata";
        System.out.println(s1.indexOf("o", 3));


        s1.length();


        /*
         *  next = prende la stringa fino a quando trova uno spazio
         *  nextLine = prende la stringa fino a quando trova l'invio
         *  Buffer della tastiera memorizza i tasti
         *  Il next legge il resto dei tasti memorizzati
         *
         *
         *  sotto-stringa = sub string
         *  "Ciao Bel Mondo"                   next() trovo le sotto-stringhe
         *    1°   2°   3°
         *
         *
         * Funzioni di String:
         * - .lenght(parametro) --> lunghezza della stringa
         *   Es. "Ciao"
         *   Output
         *       4
         *
         * - .ToLowerCase(parametro) --> converte la stringa in minuscolo
         *   Es. "Ciao"
         *   Output
         *       ciao
         *
         * - .ToUpperCase(parametro) --> converte la stringa in MAIUSCOLO
         *   Es. "Ciao"
         *   Output
         *       CIAO
         *
         * - .equals(parametro) --> confornta la stringa con il parametro
         *   Es. s1 = "Ciao" par = "ciao"
         *   Output
         *       False
         *
         * - .equalsIgnoreCase(parametro) --> confornta la stringa con il parametro
         *   Es. s1 = "Ciao" par = "ciao"
         *   Output
         *       True
         *
         * - .compareTo(parametro) --> confornta la stringa con il parametro e ritorna un numero
         *   Es1 s1 = "Ciao" par = "ciao"
         *   Output 0
         *   Es2 s1 = "Q" par = "A"
         *   Output n°> 0 Perché nel codice ASCII Q > A
         *   Es3 s1= "ABC" s2= "ABD"
         *   A = 65 B = 66 C = 67 D = 68 nel codice ascii
         *   compareTo
         *   s1 A  B  C
         *      -  -  -
         *   s2 A  B  D
         *      0  0  -1
         *   Appena trova un codice ascii diverso dall'altro si ferma e ritorna la differenza
         *
         * - .concat(parametro) --> concatena 2 stringhe in un'altra stringa  (si può scrivere anche con s1 + s2)
         *   ES. s1= "Ciao "  par= "Mondo!"
         *       s3 = s1.concat(par)
         *   Output
         *       s3 = "Ciao Mondo!"
         *
         * - .indexOf(parametro) --> cerca nella stringa il carattere e ritorna l'index della prima occorrenza
         *   Es. s1 = "Ciao" par = "a"
         *   Output
         *       2
         *   Es. s1 = "Ciao oggi è una bella giornata" par = "o"
         *   Output       ^ ^                  ^
         *       3
         *
         * - .indexOf(parametro, int fromIndex) --> cerca nella stringa il carattere e ritorna l'index della prima occorrenza partendo dall'index specificato
         *   Es. s1 = "Ciao oggi è una bella giornata" par = "o" si.indexof("o", 4)
         *   Output       ^ ^                  ^
         *       5
         *
         * - .lastIndexOf(parametro, int fromIndex) --> cerca nella stringa, partendo dalla fine, il carattere specificato e ritorna l'index della prima occorrenza
         *
         * - .substring(int startIndex, int endIndex) --> stampa la stringa dalli'ndex start fino all'index end
         *   Es. s1 = "Ciao oggi è una bella giornata" par = "o" si.indexof(0, 4)
         */

    }
}
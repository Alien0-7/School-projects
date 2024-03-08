package BreakEsempi;

import java.util.Random;

public class Es1 {

    public static void main(String[] args) {
        Random r = new Random();
        int array[] = new int[40];
        int x;

        System.out.print("Array casuale:\n[ ");
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(20)+1;
            if (i != array.length-1){
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(array[array.length-1] + " ]");

        for (int i = 0; i < array.length; i++){
            if (array[i] == 20) {
                System.out.println("\nè presente il numero 20 all'indice " + i);
                break;
            }
        }
    }

}

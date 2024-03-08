package RicercaEOrdinamento;

import java.util.Scanner;

public class RicercaLineare {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);



        // dimensione array
        final int N = 10;


        // Creazione array -----------------------
        int array[] = new int[N];
        int array1[] = new int[N];
        for(int i=0; i<array.length;i++) {
            array[i]=(int)(Math.random()*N*100);
            System.out.print(array[i] + " ");
        }
        System.err.println();

        //long startTime,endTime;

        //-----------  ORDINAMENTO BUBBLE SORT   -------------------
        //startTime = System.nanoTime();

        boolean ordinato;
        int temp;
        int i=array.length-1;
        /*
        do{
            ordinato = true;
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    ordinato=false;
                }
            }
        }while( (ordinato==false) && (i>0) );


        endTime = System.nanoTime();
        System.out.println();
        System.out.println("Tempo BubbleSort = " + (endTime - startTime)+" nanosecondi");
        System.out.println();

        // visualizza array ordinato
        for(i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
        System.out.println();



*/
        // RICERCA LINEARE -------------------------------------
        System.out.print("Inserire il numero da cercare = ");
        int x = tastiera.nextInt();

        boolean trovato = false;
        i=0;
        while ( ( !trovato ) && (i<array.length) ) {
            System.out.println("Indice = "+i+" - array["+i+"] = " + array[i]);
            if (array[i]==x)
                trovato = true;
            else
                i++;
        }
        if ( trovato )
            System.out.println("Trovato: il numero X è presente all'indice "+i);
        else
            System.out.println("NON Trovato: il numero X NON è presente!");


    }

}

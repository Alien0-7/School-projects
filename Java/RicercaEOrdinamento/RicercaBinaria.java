package RicercaEOrdinamento;

import java.util.Scanner;

public class RicercaBinaria {

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

        long startTime,endTime;

        //-----------  ORDINAMENTO BUBBLE SORT   -------------------
        startTime = System.nanoTime();

        boolean ordinato;
        int temp;
        int i=array.length-1;
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




        // RICERCA BINARIA -------------------------------------
        System.out.print("Inserire il numero da cercare = ");
        int x = tastiera.nextInt();


        int dim = array.length;
        int     inf,medio=0,sup;
        boolean trovato = false;

        inf = 0;			// indice inferiore
        sup = dim - 1;		// indice superiore

        while ((inf <= sup) && (trovato == false)){
            medio = (inf + sup)/2;				// indice medio

            System.out.println(inf+" "+sup+" "+ medio + " "+ array[medio] + " " + trovato);

            if (array[medio] == x) {

                trovato = true;
                System.out.println(inf+" "+sup+" "+ medio + " "+ array[medio] + " " + trovato);
            }
            else
            if (array[medio] > x)
                sup = medio - 1;
            else
                inf = medio + 1;
        }

        if (trovato == true)
            System.out.println("Il numero e' nella posizione " + (medio+1));
        else
            System.out.println("Il numero non e' presente nel array!");


    }

}
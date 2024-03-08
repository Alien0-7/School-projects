package RicercaEOrdinamento;


public class Selezione {

    public static void main(String[] args) {

        // dimensione array
        final int N = 100;


        // Creazione array -----------------------
        int array[] = new int[N];
        int array1[] = new int[N];
        for(int i=0; i<array.length;i++) {
            array[i]=(int)(Math.random()*N*100);
            array1[i]=array[i];

        }

        long startTime,endTime;

        //-----------  ORDINAMENTO PER SELEZIONE   -------------------
        startTime = System.nanoTime();

        int i,j,min,ind_min,temp;
        int dim = array.length;

        for(i=0; i<dim-1; i++){

            min = array[i];				// Inizializzazione del Minimo
            ind_min = i;				// e del suo indice

            for(j=i+1; j<dim; j++)		// Ricerca del Minimo tra gli elem.
                if(array[j] < min){		// successiarrayi
                    min = array[j];
                    ind_min = j;
                }

            if(ind_min != i){       	// Se il minimo < minimo iniziale
                temp = array[i];		// si effettua uno scambio
                array[i] = array[ind_min];
                array[ind_min] 	= temp;
            }

        }



        endTime = System.nanoTime();
        System.out.println("Tempo Selezione = " + (endTime - startTime)+" nanosecondi");

        // visualizza array ordinato
        for(i=0; i<array.length;i++)
            System.out.print(array[i]+" ");





    }

}

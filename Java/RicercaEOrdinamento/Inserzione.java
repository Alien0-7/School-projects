package RicercaEOrdinamento;


public class Inserzione {

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


        //-----------  ORDINAMENTO PER INSERZIONE   -------------------

        // visualizza array NON ordinato
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
        System.out.println();

        // Ordinamento
        startTime = System.nanoTime();


        //inserzione(array);
        int i,j, elemento;
        int dim = array.length;

        boolean alt;
        for(i=1; i<dim; i++){
            elemento = array[i];        	// memorizzazione dell'elemento
            j = i-1;
            alt = false;
            // ricerca dell'indice corretto
            while ( (elemento < array[j]) && (alt != true) ){
                array[j+1]=array[j];
                if (j > 0)
                    j = j-1;
                else			// j = 0 primo elemento del arrayore
                    alt = true;
            }
            if (alt == true)
                array[0] = elemento;
            else array[j+1] = elemento;  	// Inserimento al posto corretto
        }



        endTime = System.nanoTime();
        System.out.println("Tempo Inserzione 1 = " + (endTime - startTime)+" nanosecondi");

        // visualizza array ordinato
        for(i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
        System.out.println();




    }

}
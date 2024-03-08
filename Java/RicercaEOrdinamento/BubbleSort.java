package RicercaEOrdinamento;


public class BubbleSort {

    public static void main(String[] args) {

        // dimensione array
        final int N = 100;


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
        System.out.println("Tempo BubbleSort = " + (endTime - startTime)+" nanosecondi");

        // visualizza array ordinato
        for(i=0; i<array.length;i++)
            System.out.print(array[i]+" ");





    }

}
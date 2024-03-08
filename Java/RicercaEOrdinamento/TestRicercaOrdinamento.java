package RicercaEOrdinamento;

/*
 * Creare un vettore casuale di N interi (N molto grande)
 *
 * Applicare i metodi di ordinamento (copiare dalla scheda)
 * Applicare la ricerca sequenziale e binaria (copiare dalla scheda)
 *
 * Confrontare i vari metodi e farne una statistica
 * determinando il tempi di esecuzione di ricerca e ordinamento
 *
 * -------------------------------------------
 *
 *
 *
 *
 * Creare un vettore di N interi casuali
 * Creare un menù principale con lo switch per
 * l'esecuzione delle varie ricerche
 *
 * VETTORE NON ORDINATO con X presente e NON
 * Applicare i metodi di ricerca sequenziale visti a lezione
 * Disegnare in un foglio Excel le curve della complessit�
 * computazionale al variare del numero N
 * per esempio per N = 10.000, 20.000, 30.000, .. 100.000
 * oppure      per N = 100.000, 200.000, 300.000, .. 1.000.000
 *
 *
 * Successivamente ordinare il vettore con il metodo
 * Bubble Sort (vedere la scheda)
 * VETTORE ORDINATO con X presente e NON
 * Applicare il migliore metodo di ricerca sequenziale
 * e la ricerca binaria
 *
 * Disegnare in un foglio Excel le curve della complessit�
 * computazionale al variare del numero N
 * per esempio per N = 10.000, 20.000, 30.000, .. 100.000
 * oppure      per N = 100.000, 200.000, 300.000, .. 1.000.000
 *
 *
 * ------------------------------------------------------------
 *
 *
 *
 * Applicare i metodi di ordinamento (copiare dalla scheda)
 * Applicare la ricerca sequenziale e binaria (copiare dalla scheda)
 *
 * Confrontare i vari metodi e farne una statistica
 * determinando il tempi di esecuzione di ricerca e ordinamento
 *
 *
 *
 *
 *
 */


public class TestRicercaOrdinamento {

    public static void main(String[] args) {

        double tempoIniziale, tempoFinale, tempoDifferenza;

        tempoIniziale = System.nanoTime();    // ----------------------------

        //
        //    algoritmo da testare
        //
        for (int i = 1; i < 1000; i++)
            ;
        //	System.out.println(i);

        tempoFinale = System.nanoTime();        // ------------------------


        tempoDifferenza = tempoFinale - tempoIniziale;
        System.out.println("Tempo di esecuzione  = " + tempoDifferenza + " nanosecondi");
        System.out.println("Tempo di esecuzione  = " + tempoDifferenza / 1000 + " microsecondi");
        System.out.println("Tempo di esecuzione  = " + tempoDifferenza / 1000000 + " millisecondi");


    }

}
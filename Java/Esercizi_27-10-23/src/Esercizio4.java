import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int voto;
		
		
		System.out.println("Inserire il voto");		
		voto = tastiera.nextInt();
		
		while (voto < 1 || voto > 10) {
			System.out.println("Valore non corretto!");
			System.out.println("Reinserire il voto");
			voto = tastiera.nextInt();
		}
		if (voto >= 6) {
			System.out.println("LA PROVA È SUFFICIENTE");
		} else if (voto >= 4) {
			System.out.println("LA PROVA È INSUFFICIENTE");
		} else {
			System.out.println("LA PROVA È GRAVEMENTE INSUFFICIENTE");
		}
	}

}

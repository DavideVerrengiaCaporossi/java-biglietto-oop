package bigliettooop;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Quanti Kilometri vuoI percorrere?");
		 double inserisciKilometri = scan.nextDouble();
		 
		 System.out.println("Quanti anni hai ?");
		 int inserisciEta = scan.nextInt();
		 
		 Biglietto b1 = new Biglietto(inserisciKilometri, inserisciEta);
		 System.out.println("Il prezzo totale del biglietto è "+ b1.formattaPrezzo());
		 
		 
		 scan.close();
	}

}

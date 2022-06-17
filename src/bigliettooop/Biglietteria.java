package bigliettooop;

import java.util.Scanner;
//creazione classe
public class Biglietteria {
	//creazione main
	public static void main(String[] args) {
		
		
		//creazione scanner
		Scanner scan = new Scanner(System.in);
		//messaggio a schermo per l utente per i km
		 System.out.println("Quanti Kilometri vuoI percorrere?");
		 //inserimento dati da utente
		 double inserisciKilometri = scan.nextDouble();
		//messaggio a schermo per l utente per l'eta
		 System.out.println("Quanti anni hai ?");
		 //inserimento dati da utente
		 int inserisciEta = scan.nextInt();
		 
		 //creazione contenitore collegato alla classe biglietto
		 Biglietto b1 = new Biglietto(inserisciKilometri, inserisciEta);
		 //stampa il prezzo finale con la formattazione
		 System.out.println("Il prezzo totale del biglietto è "+ b1.formattaPrezzo());
		 
		 //chiusura scan
		 scan.close();
	}

}

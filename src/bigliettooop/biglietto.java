package bigliettooop;

import java.text.DecimalFormat;

public class Biglietto {
	

	
	//creazione variabili
	private double kilometri;
	private int eta;
	
	//creazione costruttore con kilometri ed eta
	public Biglietto(double kilometri, int eta) {
		super();
		this.kilometri = kilometri;
		this.eta = eta;
	}
	//FORMATTIAMO METTTENDO IL DECIAML FORMAT
	DecimalFormat df= new DecimalFormat ("#0.00€");
	
	
	
	
	// serve per poter leggere le variabili dall'esterno
	public double getKilometri() {
		return kilometri;
	}
	//serve per poter modificare le variabili dall'esterno
	public void setKilometri(double kilometri) {
		this.kilometri = kilometri;
	}
	// serve per poter leggere le variabili dall'esterno
	public int getEta() {
		return eta;
	}
	//serve per poter modificare le variabili dall'esterno
	public void setEta(int eta) {
		this.eta = eta;
	}
	//metodo che serve a calcolare il prezzo totale e il prezzo totale coni vari sconti
	public double prezzoTotale() {
		
	double calcoloPrezzo = kilometri * 0.21 ;
	if(eta <= 17) {
		calcoloPrezzo = calcoloPrezzo - (calcoloPrezzo * 20 / 100);
	}
	else if (eta >= 66) {
		calcoloPrezzo = calcoloPrezzo - (calcoloPrezzo * 40 /100);
	}
	return calcoloPrezzo;
	
	
	}
	// metodo che formatta il prezzo totale
	public String formattaPrezzo () {
		return df.format(prezzoTotale());
	}
}

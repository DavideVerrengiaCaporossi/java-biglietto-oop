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
	
	
	
	
	
	public double getKilometri() {
		return kilometri;
	}

	public void setKilometri(double kilometri) {
		this.kilometri = kilometri;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
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
	public String formattaPrezzo () {
		return df.format(prezzoTotale());
	}
}

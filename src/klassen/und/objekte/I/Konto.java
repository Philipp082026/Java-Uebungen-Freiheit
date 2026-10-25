package klassen.und.objekte.I;

public class Konto {
	
	private int kontonummer;
	private double kontostand;
	
	public Konto(int kontonummer) {
		this.kontostand = 0.0;
		this.kontonummer = kontonummer;
	}
	
	public void einzahlen(double betrag) {
		if (betrag <= 0)
			System.out.println("Der Betrag muss größer als 0 sein.");
		else
			this.kontostand = this.kontostand + betrag;
	}
	public boolean abheben(double betrag) {
		if (betrag <= 0) {
			System.out.println("Der Betrag muss größer als 0 sein.");
			return false;
		}
		if (this.kontostand >= betrag) {
			this.kontostand = this.kontostand - betrag;
			return true;
		} 
		return false;
	}
	public void print() {
		System.out.println("Kontonummer: " + this.kontonummer + " - Kontostand: " + this.kontostand);
	}
}

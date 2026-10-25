package klassen.und.objekte.I;

public class Adresse {
	
	// --- Objektvariablen -----
	private String strasse;
	private int nummer;
	private int postleitzahl;
	private String wohnort;
	
	// --- Konstruktor ---------
	public Adresse(String str, int nr, int plz, String ort) {
		this.strasse = str;
		this.nummer = nr;
		this.postleitzahl = plz;
		this.wohnort = ort;
	}
	
	// --- Objektmethoden ------
	public String getAdresse() {
		return this.strasse + " " + this.nummer + " in " + this.postleitzahl + " " + this.wohnort;
	}
	// Get-Methoden - um einen lesenden Zugriff auf die Objektvariablen zu haben
	public String getStrasse() {
		return this.strasse;
	}
	public int getNummer() {
		return this.nummer;
	}
	public int getPostleitzahl() {
		return this.postleitzahl;
	}
	public String getWohnort() {
		return this.wohnort;
	}
	
}
